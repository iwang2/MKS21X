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
    public void setCollection(String house){
	collection = house;
    }

    public void checkout(String name, String due){
	System.out.println("cannot check out a reference book");
    }
    public void returned(){
	System.out.println("reference book could not have been checked out -- return impossible");
    }

    public String circulationStatus(){
	return "non-circulating reference book";
    }

    public String toString(){
	return super.toString() + "  collection: " + getCollection();
    }
}
