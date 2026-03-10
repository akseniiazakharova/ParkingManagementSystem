package newprojekt1;


public class Prozeduren {
	
	public static void moveRight (int[] array) {
		
		int last = array[array.length - 1];
		
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array [i - 1];
		}
		
		array[0] = last;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		moveRight(numbers);
		
		System.out.println("ergebnis: ");
		for (int n : numbers) {
			System.out.println(n + " ");
		}

		
	}

}
