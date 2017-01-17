import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by gmartine on 1/15/17.
 */
public class Player {
    private BufferedReader bufferedReader;
    private PrintStream printStream;
    private Board board;

    Player(PrintStream printStream, BufferedReader bufferedReader, Board board)
    {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.board = board;
    }

    public String tellFirstPlayerMakeMove() throws IOException {
        printStream.println("Make your move:");
        String moveEntered = bufferedReader.readLine();
        board.markBoardWithX(moveEntered);
        return moveEntered;
    }

    private String readLine() {
        String numberEntered = null;
        try {
            numberEntered  = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberEntered ;
    }

    public String tellSecondPlayerMakeMove() throws IOException {
        printStream.println("Make your move:");
        String moveEntered = bufferedReader.readLine();
        //board.markBoardWithX(moveEntered);
        return moveEntered;
    }
}
