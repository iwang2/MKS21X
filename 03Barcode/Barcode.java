public class Barcode implements Comparable<Barcode>{
    private String zip;
    private int checkDigit;
    private String total;

    /* precondition: zip.length() = 5 and zip contains only digits
       postcondition: throws a runtime excpetion
       - zip is not the correct length
       - contains a non-digit
       - zip and checkDigit are initialized
    */
    public Barcode(String zip){
	if(zip.length() == 5){
	    this.zip = zip;
	}else{
	    throw new IllegalArgumentException();
	}
        try{
	    checkDigit = checkDigit();
	}catch(NumberFormatException e){
	    throw new IllegalArgumentException();
	}
	total = zip + checkDigit;
    }

    private int checkDigit(){
	int sum = 0;
	for(int i = 0; i < 5; i++){
	    sum += Integer.parseInt(""+zip.charAt(i));
	}
	return sum%10;
    }

    public Barcode clone(){
	Barcode a = new Barcode(this.zip);
	return a;
    }

    public String toString(){
	String barcode = "";
	String numbers = zip + checkDigit;
	for(int i = 0; i < 6; i++){
	    if(numbers.charAt(i)=='1'){
		barcode += ":::||" ;
	    }else if(numbers.charAt(i)=='2'){
		barcode += "::|:|" ;
	    }else if(numbers.charAt(i)=='3'){
		barcode += "::||:" ;
	    }else if(numbers.charAt(i)=='4'){
		barcode += ":|::|" ;
	    }else if(numbers.charAt(i)=='5'){
		barcode += ":|:|:" ;
	    }else if(numbers.charAt(i)=='6'){
		barcode += ":||::" ;
	    }else if(numbers.charAt(i)=='7'){
		barcode += "|:::|" ;
	    }else if(numbers.charAt(i)=='8'){
		barcode += "|::|:" ;
	    }else if(numbers.charAt(i)=='9'){
		barcode += "|:|::" ;
	    }else if(numbers.charAt(i)=='0'){
		barcode += "||:::" ;
	    }
	}
	return numbers + "  " + barcode;
    }

    public int compareTo(Barcode other){
	return (this.total).compareTo(other.total);
    }
}
    
	
