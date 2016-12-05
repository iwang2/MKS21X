import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String>{
    SuperArray a;
    int index;

    public SuperArrayIterator(){
	index = 0;
    }

    public boolean hasNext(){
	return a.length-1 > index
    }
    public SuperArray next(){
	if(hasNext()){
	    index++;
	    return a.index;
	}else{
	    return new NoSuchElementException();
	}
    }
    public void remove(){
	throw new UnsupportedOperationException();
    }
}
