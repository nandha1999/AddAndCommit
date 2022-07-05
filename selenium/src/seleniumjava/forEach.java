package seleniumjava;

public class forEach{
	
	public static void main(String args[]) {
		
		int sum=0;
		int arr[]= {3,4,56,6,7};
		
		for(int x:arr) {
			sum+=x;
		}
		
		System.out.println("The sum of all the value is "+sum);
	}
}