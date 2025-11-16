package h3;

public class H3_main {

	public static void main(String[] args) {
   
		int[][] einheiten = new int [2][15];
		int[] werte = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		
		for (int i = 0; i < 15; i++) {
			einheiten[0][i] = werte[i];
			einheiten[1][i] = 0;
		}
		
		int input = 208;
		int rest = input;
		
		for (int i = 0; i < einheiten[0].length; i++) {
			if (rest >= einheiten[0][i]) {
			einheiten[1][i] = rest / einheiten[0][i];
			rest = rest % einheiten[0][i];
		}
	}
	
	System.out.println("Betrag: " + input + " Cent");
	System.out.println("Verteilung der Stücke:");
	for (int i = 0; i < einheiten[0].length; i++) {
		if (einheiten[1][i] > 0) {
		System.out.println(einheiten[1][i] + " x " + einheiten[0][i] + " Cent");
	}

}
	System.out.println("Array Einheiten:");
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j< 15; j++) {
			System.out.print(einheiten[i][j] +" ");
}
System.out.println();
}
}
}
