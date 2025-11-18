package p2;

public class P2_main {

	public static void main(String[] args) {
		
		int[ ] numbers = {4,2,3,4,1};
				int max;
				int minIndex;
				
				max = numbers[0];
				minIndex = 0;
				for (int i = 1; i < numbers.length ; i++) {
					if (numbers[i] > max) {
						max = numbers[i];
						minIndex = i;
					}
				}
System.out.println("Maximaler Wert ist " + max + " und deessenkleinster Index ist "+ minIndex);
}
}
