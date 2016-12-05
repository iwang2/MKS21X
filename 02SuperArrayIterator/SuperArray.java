import java.util.*;
public class SuperArray implements Iterable<String>{
    private String[] data;
    private int size;

    //constructor - empty superArray, size 0 capacity 10
    public SuperArray(){
	size = 0;
	data = new String[10];
    }

    public SuperArray(int initialCapacity){
	if(initialCapacity < 0){
	    throw new IllegalArgumentException();
	}
	size = 0;
	data = new String[initialCapacity];
    }

    public Iterator<String> iterator(){
	return new SuperArrayIterator(this);
    }
    
    public int size(){
	return size;
    }
    
    //returns the element at the specified position
    public String get(int index){
	if(index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	return data[index];
    }

    public void clear(){
	String[] temp = new String[data.length];
	data = temp;
	size = 0;
    }

    public boolean isEmpty(){
	if(size == 0) return true;
	else return false;
    }

    public String set(int index, int element){
	if(index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	data[index] = "" + element;
	return data[index];
    }
    
    //resize data, new array & copying over elements
    private void grow(){
	String[] temp = new String[data.length + 5];
	for(int i = 0; i < data.length; i++){
	    temp[i] = data[i];
	}
	data = temp;
    }
    
    //add value n to next available slot, return true
    public boolean add(String n){
	if(size == data.length){
	    this.grow();
	}
	data[size] = n;
	size++;
	return true;
    }

    //inserts element at index, shifts everything at and after to the right
    public void add(int index, String element){
	if(index < 0 || index > size){
	    throw new IndexOutOfBoundsException();
	}
	if(size == data.length){
	    this.grow();
	}
	for(int i = size; i > index; i--){
	    data[i] = data[i-1];
	}
	data[index] = element;
	size++;
    }

    public String remove(int index){
	if(index < 0 || index >= this.size()){
	    throw new IndexOutOfBoundsException();
	}
	String n = data[index];
	for(int i = index; i < size; i++){
	    data[i] = data[i+1];
	}
	size--;
	return n;
    }

    public String[] toArray(){
	String[] shorter = new String[size];
	for(int i = 0; i < size; i++){
	    shorter[i] = data[i];
	}
	return shorter;
    }

    public int indexOf(String n){
	for(int i = 0; i < size; i++){
	    if(n == data[i]){
		return i;
	    }
	}
	return -1;
    }
    public int lastIndexOf(String n){
	for(int i = size-1; i >= 0; i--){
	    if(n == data[i]){
		return i;
	    }
	}
	return -1;
    }
    
    public String toString(){
	String temp = "[";
	for(int i = 0; i < size; i++){
	    if(i == (size-1)){
		temp += data[i];
	    }
	    else{
		temp += data[i] + ", ";
	    }
	}
	return temp + "]";
    }
    
    public String toStringDebug(){
	String temp = "[";
	for(int i = 0; i < size; i++){
	    if(i == (data.length-1)){
		temp += data[i];
	    }
	    else{
		temp += data[i] + ", ";
	    }
	}
	for(int i = size; i < data.length; i++){
	    if(i == (data.length-1)){
		temp += "_";
	    }
	    else{
		temp += "_, ";
	    }
	}
	return temp + "]";
    }
}
