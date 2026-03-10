package see;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		drawBoard drawboard = new drawBoard();
		
		char currerentPlayer = 'X';
		boolean running = true;
		
		System.out.println();
		System.out.println("Willkommen in das Spiel!");
		
		
		
		while (running) {
			
			drawboard.display();
			System.out.println("Player " + currerentPlayer + " enter row and line: " );
			int row = scanner.nextInt();
			int line = scanner.nextInt();
			
		}
		
		
		

	}

}
