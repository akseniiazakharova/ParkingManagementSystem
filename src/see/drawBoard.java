package see;

import newprojekt.newProjekt;

public class drawBoard {
	private char[][] cells;

	public drawBoard() {
		cells = new char[][] {
			{'1', ' ', ' '},
			{' ', '1', ' '},
			{' ', ' ', ' '},
	};
	}
	public void display() {
		System.out.println("\n  0   1   2  (столбцы)");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 3; j++) {
				System.out.print(cells[i][j] + (j < 2 ? " | " : " "));	
			}
			
			System.out.println();
			
			if (i < 2) System.out.println("-------------");
			
		}
		
	}
	
	//Methode 
	public boolean placeMove(int row, int line, char player) {
		if (row >= 0 && row < 3 && line >= 0 && line < 3 && cells[row][line] == ' ') {
			cells[row][line] = player;
			return true;
			
		}
		return false;
		
	}
	// Геттер, чтобы другие классы могли проверить состояние ячеек
	public char[][] getCells() {
		return cells;
	}
		

}
