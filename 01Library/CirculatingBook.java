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

}
