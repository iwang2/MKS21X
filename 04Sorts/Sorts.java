public class Sorts{
    
    public static String name(){
	return "10.Wang.Ida";
    }

    public static void selectionSort(int[] data){
	int start = 0;
        while(start < data.length-2){
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
}
