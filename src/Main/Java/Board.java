import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by gmartine on 1/13/17.
 */
public class Board {
    private PrintStream printStream;

    Board(PrintStream printStream)
    {
        this.printStream =printStream;
    }

    public void drawBoard() {
        ArrayList<String> boardList = new ArrayList();
        String row1 = "1|2|3";
        String row2 = "4|5|6";
        String row3 = "7|8|9";
        String lines = "-----";
        printStream.println(row1 + "\n" +lines +"\n" + row2 + "\n"+ lines + "\n" + row3 + "\n");
    }
}


