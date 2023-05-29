import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        Player player1 = new Player("Player 1",'x');
        Player player2 = new Player("Player2", 'o');

        while(true){
            System.out.println("player 1 enter number");
            board.printBoard();

            int moveNumber = scanner.nextInt();

            board.movePlayer(moveNumber, 'x');

        }

//        System.out.println("Board");
//        board.printBoard();
//        System.out.println(board.isValidMove(1,1));

    }
}