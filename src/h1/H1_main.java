package h1;

public class H1_main {

	public static void main(String[] args) {
		int[] myArray = {675, 99999, 1, 8003};
		
		System.out.print("Umgedrehtes Array: ");
		
	for (int i = myArray.length - 1; i >= 0; i--) {
		System.out.print(myArray[i] + " ");
	}

	}

}
