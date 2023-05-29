import java.util.Random;

// An interface or base class for all strategies. Strategies can be implemented as subclasses, providing different algorithms for making moves
public class TicTacToeStrategy {
//    public Move makeMove;
    public Move makeMove(Board board) {
    // Implement your strategy for making a move here
    // For example, you can use random selection or an AI algorithm

    // Random selection example
        Random random = new Random();
        int row = random.nextInt(3);
        int col = random.nextInt(3);

        // Create and return the move
        return new Move(row, col);
    }
}
