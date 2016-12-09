public class Barcode implements Comparable<Barcode>{
    private String _zip;
    private int _checkDigit;
    private String total = _zip + _checkDigit;

    private String[] codelist = {"||:::",  //0
				 ":::||",  //1
				 "::|:|",  //2
				 "::||:",  //3
				 ":|::|",  //4
				 ":|:|:",  //5
				 ":||::",  //6
				 "|:::|",  //7
				 "|::|:",  //8
				 "|:|::"}; //9
    
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
        try{
	    _checkDigit = checkDigit();
	}catch(NumberFormatException e){
	    throw new IllegalArgumentException("zip must be a String of numbers only");
	}
	total = _zip + _checkDigit;
    }

    private int checkDigit(){
	int sum = 0;
	for(int i = 0; i < 5; i++){
	    sum += Integer.parseInt(""+_zip.charAt(i));
	}
	return sum%10;
    }

    public String toString(){
    }

    public int compareTo(Barcode other){
	return (this._zip).compareTo(other._zip);
    }
}
    
	
