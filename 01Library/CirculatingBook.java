public class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;
    private boolean circulating;

    public CirculatingBook(String name, String book,
			   String number, String call){
	super(name,book,number,call);
	currentHolder = "";
	dueDate = "";
	circulating = false;
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
	circulating = true;
    }
    public void returned(){
	setCurrentHolder("");
	setDueDate("");
	circulating = false;
    }

    public String circulationStatus(){
	if(circulating){
	    return "  current holder: " + getCurrentHolder() + 
	    "   date: " + getDueDate();
	}else{
	    return "  status: checked out";
	}
    }

    public String toString(){
	String status = "   ";
	if(circulating){
	    status += circulationStatus();
	}
	return super.toString() + status;
    }
}
