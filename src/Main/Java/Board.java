import java.io.PrintStream;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

/**
 * Created by gmartine on 1/13/17.
 */
public class Board {
    private PrintStream printStream;

    Board(PrintStream printStream)
    {
        this.printStream =printStream;
    }
    //ArrayList<String> boardList = new ArrayList();

    public void drawBoard() {
        String board;
        board = "1"+"|"+"2"+"|"+"3\n";
        board += "-----\n";
        board += "4"+"|"+"5"+"|"+"6\n";
        board += "-----\n";
        board += "7"+"|"+"8"+"|"+"9\n";
        printStream.println(board);
    }

//    public void redrawBoardX(String s) {
//        int locationNumber = parseInt(s);
//        boardList.set(locationNumber, "X");
//        drawBoard();
//    }
}


