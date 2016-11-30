public class Book{
    private String author;
    private String title;
    private String ISBN;

    public Book(){
    }
    public Book(String name,String book,String number){
        setAuthor(name);
        setTitle(book);
	setISBN(number);
    }

    public String getAuthor(){
	return author;
    }
    public void setAuthor(String name){
	author = name;
    }
    public String getTitle(){
	return title;
    }
    public void setTitle(String book){
	title = book;
    }
    public String getISBN(){
	return ISBN;
    }
    public void setISBN(String number){
	ISBN = number;
    }
	
    public String toString(){
	return getTitle() + ", " + getAuthor() + ", " + getISBN();
    }
}
