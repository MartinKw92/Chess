import java.util.Random;

public class Tower {

    private static int BOARD_SIZE = 8;

    private int [][] board;

    public boolean checkBeat() {
        for (int row=0;row<BOARD_SIZE;row++) {
            for (int column=0;column<BOARD_SIZE;column++) {
                // tower is here:)
                if (board[row][column]==1) {
                    if (checkTowersHorizontally(row, column)) return true;
                    if (checkTowersVertically(row, column)) return true;
                }
            }
        }
        return false;
    }

    private boolean checkTowersHorizontally(int row, int column) {
        for (int k=0; k<BOARD_SIZE;k++) {
            if (k!=column) {
                if (board[row][k]==1) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkTowersVertically(int row, int column) {
        for (int k=0; k<BOARD_SIZE;k++) {
            if (k!=row) {
                if (board[k][column]==1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void initializeBoard() {
        board = new int[BOARD_SIZE][BOARD_SIZE];
        Random random = new Random();

        for (int i=0;i<BOARD_SIZE;i++) {
            int row = random.nextInt(BOARD_SIZE);
            int column = random.nextInt(BOARD_SIZE);
            board[row][column] = 1;
        }

    }

    public void initializeBoard(int [][] board) {
        this.board = board;
    }

    public void printBoard() {
        for (int i=0;i<BOARD_SIZE;i++) {
            for (int j=0;j<BOARD_SIZE;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
