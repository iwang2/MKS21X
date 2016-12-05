import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String>{
    SuperArray a;
    int index;

    public SuperArrayIterator(SuperArray a){
	index = 0;
	this.a = a;
    }

    public boolean hasNext(){
	return a.size()-1 > index;
    }
    public String next(){
	if(hasNext()){
	    index++;
	    return a.get(index);
	}else{
	    throw new NoSuchElementException();
	}
    }
    public void remove(){
	throw new UnsupportedOperationException();
    }
}
