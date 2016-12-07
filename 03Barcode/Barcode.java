public class Barcode implement Comparable<Barcode>{
    private String zip;
    private int checkDigit;

    /* precondition: zip.length() = 5 and zip contains only digits
       postcondition: throws a runtime excpetion
       - zip is not the correct length
       - contains a non-digit
       - zip and checkDigit are initialized
    */
    public Barcode(String zip){
	this.zip = zip;
	checkDigit = checkDigit();
    }

    public int checkDigit(){
	int sum = 0;
	for(int i = 0; i < 5; i++){
	    sum += Integer.parseInt(""+zip.charAt(i));
	}
	return sum%10;
    }
	
