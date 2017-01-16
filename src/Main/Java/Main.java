import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by gmartine on 1/13/17.
 */
public class Main {

    private static PrintStream printStream;
    private static Board board;
    private static Game game;
    private static BufferedReader bufferedReader;
    private static Player player;

    public static void main(String[] args) throws IOException {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        printStream = new PrintStream(System.out);
        board = new Board(printStream);
        player = new Player(printStream, bufferedReader);
        game = new Game(printStream, board, player);

        game.start();

    }

}

