
//A class representing a player in the game. It serves as the context and executes a specific strategy.
public class Player {
    private String Player1;
    private String Player2;
    private char Symbol;

    public Player(String player1, String player2) {
        Player1 = player1;
        Player2 = player2;
    }

    public Player(String player1, char symbol) {
        Player1 = player1;
        Symbol = symbol;
    }

    public String getPlayer1() {
        return Player1;
    }

    public void setPlayer1(String player1) {
        Player1 = player1;
    }

    public String getPlayer2() {
        return Player2;
    }

    public void setPlayer2(String player2) {
        Player2 = player2;
    }

    public  void makeMove(Board board,int player, char symbol){
//        if (board.isValidMove(row, col)) {
            // Update the board with the player's symbol
            board.movePlayer(player, symbol);
//        } else {
//            System.out.println("Invalid move. Please try again.");
//        }
    }
}
