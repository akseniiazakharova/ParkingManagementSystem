package see;

import java.util.Scanner;

import java.util.Scanner;

public class see {
    public static void main(String[] args) {
        // Создаем пустое поле 3x3
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        char currentPlayer = 'X';
        boolean gameFinished = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в Крестики-Нолики!");

        while (!gameFinished) {
            // ШАГ 1: Рисуем поле (используем те самые 2D циклы)
            drawBoard(board);
            
            // ШАГ 2: Просим игрока сделать ход
            System.out.println("Игрок " + currentPlayer + ", твой ход!");
            System.out.print("Введите номер строки (0, 1 или 2): ");
            int row = scanner.nextInt();
            System.out.print("Введите номер столбца (0, 1 или 2): ");
            int col = scanner.nextInt();

            // ШАГ 3: Проверяем, можно ли туда поставить символ
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer; // Ставим символ в массив
                
                // ШАГ 4: Проверяем, не выиграл ли кто-то
                if (checkWinner(board, currentPlayer)) {
                    drawBoard(board);
                    System.out.println("УРА! Победил игрок " + currentPlayer + "!");
                    gameFinished = true;
                } else if (isBoardFull(board)) {
                    drawBoard(board);
                    System.out.println("Ничья! Места больше нет.");
                    gameFinished = true;
                } else {
                    // Переход хода к другому игроку
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("\nОШИБКА: Эта клетка занята или таких координат нет. Попробуй еще раз!\n");
            }
        }
        scanner.close();
    }

    // МЕТОД ДЛЯ РИСОВАНИЯ ПОЛЯ (2D ЦИКЛ)
    public static void drawBoard(char[][] board) {
        System.out.println("\n  0   1   2  (столбцы)");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " "); // Номер строки
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | "); // Рисуем разделитель между клетками
            }
            System.out.println();
            if (i < 2) System.out.println("  ---------"); // Рисуем линию между рядами
        }
        System.out.println();
    }

    // ЛОГИКА ПРОВЕРКИ ПОБЕДЫ
    public static boolean checkWinner(char[][] b, char p) {
        for (int i = 0; i < 3; i++) {
            // Проверка строк и столбцов
            if ((b[i][0] == p && b[i][1] == p && b[i][2] == p) || 
                (b[0][i] == p && b[1][i] == p && b[2][i] == p)) return true;
        }
        // Проверка двух диагоналей
        return (b[0][0] == p && b[1][1] == p && b[2][2] == p) || 
               (b[0][2] == p && b[1][1] == p && b[2][0] == p);
    }

    // ПРОВЕРКА НА НИЧЬЮ (2D ЦИКЛ ПОИСКА)
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false; // Если нашли пробел, значит поле не полное
            }
        }
        return true;
    }
}


