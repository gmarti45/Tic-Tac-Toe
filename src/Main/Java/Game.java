import java.io.PrintStream;

/**
 * Created by gmartine on 1/15/17.
 */
public class Game {
    PrintStream printStream;
    Board board;
    Player player;

    public Game(PrintStream printStream, Board board, Player player) {
        this.printStream = printStream;
        this.board = board;
        this.player = player;
    }

    public void start() {
        board.drawBoard();
        player.tellFirstPlayerMakeMove();
    }

}
