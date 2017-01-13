import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Created by gmartine on 1/13/17.
 */
public class Main {

    public static void main(String[] args) {
        Board board = new Board(System.out);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Input input = new Input(System.out, bufferedReader);
        board.drawBoard();
        input.askPlayerXMark();

    }

}
