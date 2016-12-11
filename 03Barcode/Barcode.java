public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    
    /* precondition: zip.length() = 5 and zip contains only digits
       postcondition: throws a runtime excpetion
       - zip is not the correct length
       - contains a non-digit
       - zip and checkDigit are initialized
    */
    public Barcode(String zip){
	if(zip.length() == 5){
	    _zip = zip;
	}else{
	    throw new IllegalArgumentException("invalid length");
	}
	_checkDigit = checkDigit(_zip);
    }

    private static int checkDigit(String zip){
	int sum = 0;
	try{
	    for(int i = 0; i < 5; i++){
		sum += Integer.parseInt(""+zip.charAt(i));
	    }
	}catch(NumberFormatException e){
	    throw new IllegalArgumentException("zip must be a String of integers only");
	}
	return sum%10;
    }

    public String toString(){
	return toCode(_zip);
    }

    public static String toCode(String zip){
	if(zip.length() != 5){
	    throw new IllegalArgumentException("incorrect zip length");
	}
        zip += checkDigit(zip);
	String[] codeList = {"||:::",  //0
			     ":::||",  //1
			     "::|:|",  //2
			     "::||:",  //3
			     ":|::|",  //4
			     ":|:|:",  //5
			     ":||::",  //6
			     "|:::|",  //7
			     "|::|:",  //8
			     "|:|::"}; //9
	String code = "";
	for(int i = 0; i < 5; i++){
	    code += codeList[Integer.parseInt(""+zip.charAt(i))];
	}
	return "|" + code + "|";
    }
    public static String toZip(String code){
	String zip = "";
	int counter = 0;
	code = code.substring(1,code.length()-1);
	String[] codeList = {"||:::",  //0
			     ":::||",  //1
			     "::|:|",  //2
			     "::||:",  //3
			     ":|::|",  //4
			     ":|:|:",  //5
			     ":||::",  //6
			     "|:::|",  //7
			     "|::|:",  //8
			     "|:|::"}; //9
	for(int i = 0; i < code.length()/5; i++){
	    while(zip.length() <= i){
		if(code.substring(0,5) == codeList[counter]){
		    zip += counter;
		    code = code.substring(5);
		}
		else counter++;
		if(counter == 10){
		    throw new IllegalArgumentException("encoded ints are invalid");
		}
	    }
	}
	return zip;
    }
    
    public int compareTo(Barcode other){
	return (this._zip).compareTo(other._zip);
    }
}
    
	
