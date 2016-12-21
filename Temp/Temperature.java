public class Temperature{
    
    public static double CtoF(double t){
	return t * 1.8 + 32.0; 
    }
    
    public static double FtoC(double t){
	return (t - 32.0) / 1.8;
    }

    public static void main(String[]args){
	System.out.println(CtoF(-40.0)); // -40.0
	System.out.println(CtoF(100.0)); // 212.0
	System.out.println(FtoC(212.0)); // 100.0
	System.out.println(FtoC(32.0)); // 0.0
    }
    
}
