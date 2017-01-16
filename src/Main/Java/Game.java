import java.io.PrintStream;

/**
 * Created by gmartine on 1/15/17.
 */
public class Game {
    PrintStream printStream;
    Board board;

    public Game(PrintStream printStream, Board board) {
        this.printStream = printStream;
        this.board = board;
    }

    public void start() {
        board.drawBoard();
    }

    public void tellFirstPlayerMakeMove() {
        printStream.println("Make your move:");
    }
}
