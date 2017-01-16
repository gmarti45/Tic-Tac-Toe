import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by gmartine on 1/13/17.
 */
public class Main {

    private static PrintStream printStream;

    public static void main(String[] args) {
        Board board = new Board(System.out);
        Game game = new Game(printStream, board);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Input input = new Input(System.out, bufferedReader);
        game.start();

    }

}

