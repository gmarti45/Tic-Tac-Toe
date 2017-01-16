import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

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

    public void start() throws IOException {
        List<String> boardList;
        board.drawBoard();
        player.tellFirstPlayerMakeMove();
    }

}
