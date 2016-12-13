public class Sorts{
    
    public static String name(){
	return "10.Wang.Ida";
    }

    public static void selectionSort(int[] data){
	int start = 0;
        while(start < data.length-1){
	    int smallest = data[start];
	    int swap = start;
	    for(int i = start; i < data.length; i++){
		if(data[i] < smallest){
		    smallest = data[i];
		    swap = i;
		}
	    }
	    data[swap] = data[start];
	    data[start] = smallest;
	    start++;
	}
    }

    public static String toString(int[] data){
	String result = "";
	for(int i = 0; i < data.length; i++){
	    result += ", " + data[i];
	}
	return "[" + result.substring(2) + "]";
    }

    public static void main(String[]args){
	int[] a = {3,4,77,0,0,13};
	selectionSort(a);
	System.out.println(toString(a));
    }
}
