import java.util.Scanner;

public class Game {
    private static char[][] board;
    private static char currentPlayer;

    public Game(){
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    public static void initializeBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '#';
            }
        }
        printBoard(board);
    }

    public static void printBoard(char[][] board){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j<2?board[i][j]+" | ":board[i][j]);
            }
            System.out.println();
        }
    }

    public static void boardIndices(int position){
        switch (position){
            case 0: board[0][0] = currentPlayer;
                break;
            case 1: board[0][1] = currentPlayer;
                break;
            case 2: board[0][2] = currentPlayer;
                break;
            case 3: board[1][0] = currentPlayer;
                break;
            case 4: board[1][1] = currentPlayer;
                break;
            case 5: board[1][2] = currentPlayer;
                break;
            case 6: board[2][0] = currentPlayer;
                break;
            case 7: board[2][1] = currentPlayer;
                break;
            case 8: board[2][2] = currentPlayer;
                break;
        }
    }

    public static void playerSwitch(){
        currentPlayer = currentPlayer=='X'?'O':'X';
    }

    public void playGame(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Your player is " + currentPlayer);
            System.out.println("Enter Playing position: ");
            int input = scanner.nextInt();
            boardIndices(input);
            printBoard(board);
            playerSwitch();
        }
    }
}
