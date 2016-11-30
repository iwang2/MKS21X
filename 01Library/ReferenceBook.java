public class ReferenceBook extends LibraryBook{
    private String collection;

    public ReferenceBook(String name,String book,
			 String number, String call,
			 String house){
	super(name,book,number,call);
	setCollection(house);
    }

    public String getCollection(){
	return collection;
    }
    public void setCollection(house){
	collection = house;
    }

    public void checkout(String patron, String due){
	throw new NullPointerException();
    }
    public void returned(){
	throw new NullPointerException();
    }

    public String circulationStatus(){
	return "non-circulating reference book";
    }
}
