package h2;

public class H2_main {

	public static void main(String[] args) {
        int n = 500778;
        int digits = 0;
        int[] a = new int[9];
        
        int temp = n;
        int index = 8;
        do {
        	a[index] = temp % 10;
        	temp = temp / 10;
        	digits++;
        	index--;
	} while (temp > 0);
	
        System.out.println("Anzahl der Ziffern: " + digits);
        System.out.print("Array a: ");
        for (int value : a) {
        	System.out.print(value + " ");
     }
   }
}
