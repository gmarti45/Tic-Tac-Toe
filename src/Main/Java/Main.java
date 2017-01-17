import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        List<String> boardList = new ArrayList<String>();
        boardList.addAll(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        board = new Board(printStream, boardList, player);
        player = new Player(printStream, bufferedReader, board);
        game = new Game(printStream, board, player);

        game.start();

    }

}

