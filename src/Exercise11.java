public class Exercise11 {
    public static final int NUM_ROWS = 8;
    public static final int NUM_COLS = 8;
    static char[][] board = new char[NUM_ROWS][NUM_COLS];

    public static void main(String[] args) {


        initBoard();
        printBoard();
    }

    private static void initBoard() {
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                board[row][col] = '.';
            }
        }
    }

    private static void printBoard() {
        System.out.print("  ");

        for (int i = 1 ; i <= NUM_COLS; i++) {
                System.out.print(i + "  ");
            }
        System.out.println();
        char letter = 'A';

        for (int row = 0; row < NUM_ROWS; row++) {
            System.out.print(letter + " ");
            letter++;
            for (int col = 0; col < NUM_COLS; col++) {
                System.out.print(board[row][col] + "  ");
            }
            System.out.println();
        }

    }
}