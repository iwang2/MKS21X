import java.util.Iterator;
import java.util.NoSuchElementException;

public class SuperArrayIterator implements Iterator<String>{
    private SuperArray a;
    private int index;

    public SuperArrayIterator(SuperArray a){
	index = 0;
	this.a = a;
    }

    public boolean hasNext(){
	return a.size() > index;
    }
    public String next(){
	if(hasNext()){
	    index++;
	    return a.get(index-1);
	}else{
	    throw new NoSuchElementException();
	}
    }
    public void remove(){
	throw new UnsupportedOperationException();
    }
}
