
//A class representing the game board and its state
public class Board {
    private char[][] board;

    public Board() {
//        this.board = board;
        board = new char[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
    }
    public void printBoard() {
        int count = 1; // Counter for numbering the empty blocks

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    // Print the block number for empty cells
                    System.out.print(count);
                    count++;
                } else {
                    // Print the symbol for non-empty cells
                    System.out.print(board[row][col]);
                }
                if (col < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (row < 2) {
                System.out.println("---------");
            }
        }
    }

    public void movePlayer(int player, char symbol){
        if(player == 1 ){
            board[0][0] = symbol;
        }else if(player == 2){
            board[0][1] = symbol;
        }else if(player == 3){
            board[0][2] = symbol;
        }else if(player == 4){
            board[1][0] = symbol;
        }else if(player == 5){
            board[1][1] = symbol;
        }else if(player == 6){
            board[1][2] = symbol;
        }else if(player == 7){
            board[2][0] = symbol;
        }else if(player == 8){
            board[2][1] = symbol;
        }else if(player == 9){
            board[2][2] = symbol;
        }else{
            System.out.println("NA");
        }
    }
//    public Boolean isValidMove(int row, int col){
//        if((row < 0 || col < 0) || (row > 3 || col > 3)){
//            return (false);
//        }
//        return true;
//    }


//    public void updateBoard(int row, int col,char symbol){
//        board[row][col] = symbol;
//    }
}
