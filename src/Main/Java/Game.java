import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
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
        board.drawBoard();
        player.tellFirstPlayerMakeMove();
        player.tellSecondPlayerMakeMove();
    }



}
