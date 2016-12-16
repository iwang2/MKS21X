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
    public static void insertionSort(int[] data){
	for(int i = 0; i < data.length-1; i++){
	    int value = data[i+1];
	    int index = i;
	    while(index != 0 && value < data[index]){
		data[index+1] = data[index];
		index--;
	    }
	    if(index == 0 && value < data[index]){
	        data[1] = data[0];
		data[0] = value;
	    }else{
		data[index+1] = value;
	    }
	}
    }
    public static void bubbleSort(int[] data){
	int last = data.length-1;
	int counter;
	int swap;
        do{
	    counter = 0;
	    for(int i = 0; i < last; i++){
		if(data[i] > data[i+1]){
		    swap = data[i];
		    data[i] = data[i+1];
		    data[i+1] = swap;
		    counter++;
		}
	    }
	    last--;
	} while(counter!=0);
    }

    public static String toString(int[] data){
	String result = "";
	for(int i = 0; i < data.length; i++){
	    result += ", " + data[i];
	}
	return "[" + result.substring(2) + "]";
    }

    public static int[] generate(int length){
	int[] a = new int[length];
	for(int i = 0; i < length; i++){
	    a[i] = (int)(Math.random() * 99);
	}
	//System.out.println(toString(a));
	return a;
    }

    public static void main(String[]args){
	/*
	int[] a = {3,4,77,0,0,13};
	System.out.println(toString(a));
	selectionSort(a);
	System.out.println(toString(a));
	
	int[] b = {3,4,77,0,0,13};
	insertionSort(b);
	System.out.println(toString(b));

	int[] c = generate(10);
	insertionSort(c);
	System.out.println(toString(c));

	int[] d = {2,1};
	insertionSort(d);
	System.out.println(toString(d));

	int[] e = generate(10);
	bubbleSort(e);
	System.out.println(toString(e));
	*/

	if(args.length == 0){
	    System.out.println("[array length] [ 0-selection / 1-insertion / 2-bubble]");
	}
	else{	    
	    long startTime = System.currentTimeMillis();
	    
	    int[] a = generate(Integer.parseInt(args[0]));
	    
	    if(args[1].equals("0")){
		selectionSort(a);
		//System.out.println(toString(a));
	    }else if(args[1].equals("1")){
		insertionSort(a);
		//System.out.println(toString(a));
	    }else if(args[1].equals("2")){
		bubbleSort(a);
		//System.out.println(toString(a));
	    }
	    
	    long endTime = System.currentTimeMillis();
	    long time = endTime-startTime;
	    System.out.println("time: " + time);
	}
    }
}
