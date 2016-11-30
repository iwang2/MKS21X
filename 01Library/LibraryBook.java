abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    public LibraryBook(String name,String book,
		       String number,String call){
        super(name,book,number);	
	callNumber = call;
    }

    public String getCallNumber(){
	return callNumber;
    }
    public void setCallNumber(String call){
	callNumber = call;
    }

    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();

    public String toString(){
	return super.toString() +
	    "\n status: " + circulationStatus() + 
	    "\n call number: " + getCallNumber();
    }
    public int compareTo(LibraryBook o){
	String t1 = this.getCallNumber();
	String t2 = o.getCallNumber();
	
        if(t1.compareTo(t2) > 0){
	    return 1;
	}
	else if(t1.compareTo(t2) == 0){
	    return 0;
	}
	return -1;
    }
}