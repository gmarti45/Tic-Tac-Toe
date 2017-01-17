import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gmartine on 1/13/17.
 */
public class Input {
    private BufferedReader bufferedReader;
    private PrintStream printStream;
    private Player player;
    List<String> boardList = new ArrayList<String>();
    Board board =new Board(printStream, boardList, player);

    Input(PrintStream printStream, BufferedReader bufferedReader) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }


    public String askPlayerXMark() throws IOException {
        printStream.println("Enter a number indicating where you want to place your mark:");
        String numberEntered = bufferedReader.readLine();
        return numberEntered;
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
}
