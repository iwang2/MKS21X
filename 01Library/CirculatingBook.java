public class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private string dueDate;

    public CirculatingBook(String name, String book, String number, String call){
	super(name,book,number,call);
	currentHolder = "";
	dueDate = "";
    }

    public String getCurrentHolder(){
	return currentHolder;
    }
    public void setCurrentHolder(String name){
	currentHolder = name;
    }
    public String getDueDate(){
	return dueDate;
    }
    public void setDueDate(String date){
	dueDate = date;
    }

    public void checkout(String name, String date){
	setCurrentHolder(name);
	setDueDate(date);
    }
    public void returned(){
	setCurrentHolder("");
	setDueDate("");
    }

    public String circulationStatus(){
	String status = "";
	if(getCurrentHolder().compareTo(status) == 0){
	    status = "book available on shelves";
	}else{
	    status = "book has been checked out";
	}
	return "current holder: " + getCurrentHolder() + 
	    "\ndate: " + getDueDate() +
	    "\nstatus: " + status;
    }

    public String toString(){
	if(
	return super.toString() + 
}
