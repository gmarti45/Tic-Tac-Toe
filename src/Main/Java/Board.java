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
    ArrayList<String> boardList = new ArrayList();

    public void drawBoard() {
        boardList.add("0");
        boardList.add("1");
        boardList.add("2");
        boardList.add("3");
        boardList.add("4");
        boardList.add("5");
        boardList.add("6");
        boardList.add("7");
        boardList.add("8");
        boardList.add("9");

        String row1 = boardList.get(1)+"|"+boardList.get(2)+"|"+boardList.get(3);
        String row2 = boardList.get(4)+"|"+boardList.get(5)+"|"+boardList.get(6);
        String row3 = boardList.get(7)+"|"+boardList.get(8)+"|"+boardList.get(9);
        String lines = "-----";
        printStream.println(row1 + "\n" +lines +"\n" + row2 + "\n"+ lines + "\n" + row3 + "\n");
    }

    public void redrawBoardX(String s) {
        int locationNumber = parseInt(s);
        boardList.set(locationNumber, "X");
        drawBoard();
    }
}


