package homework1;

import java.util.Date;

public class PrintfTest {
	
	public static void main(String[] args) {
		
		Date today = new Date();
		
		System.out.printf("%s   %s   %s   %s   %s", "This", "is", "sum", "of", "array:");

		System.out.printf("%d", sum(new int[] { 1, 2, 3 }));
		
		System.out.println("\nДесятичное число с точкой и 5 знаков после точки ");
		
	    System.out.printf("%.5f\n", Math.PI);
	    
	    System.out.println("Разделитель между тысячами: ");
	    
	    System.out.printf("%,d\n", 50000000);
	    
	    System.out.printf("Date today is %tD\n", today);
	    
	    System.out.printf("Current time is %tT\n", today);
	    

	}

	private static int sum(int[] a) {
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];  
		}
		
		return sum;
	}

}
