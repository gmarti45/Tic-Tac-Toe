import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Created by gmartine on 1/13/17.
 */
public class Board {
    private PrintStream printStream;
    private List<String> boardList;
    private Player player;

    Board(PrintStream printStream, List<String> boardList, Player player)
    {
        this.printStream =printStream;
        this.boardList = boardList;
        this.player = player;
    }



    public void drawBoard() {
        String board ="";
        for(int cell = 0; cell<7; cell =cell+3)
        {
            board += String.format("%s|%s|%s\n", boardList.get(cell), boardList.get(cell+1), boardList.get(cell+2));
            if(cell==0 |cell==3)
            {
                board +="-----\n";
            }

        }
        printStream.println(board);
    }

    public void markBoardWithX(String cell) throws IOException {
        int locationNumber = parseInt(cell);
        boardList.set(locationNumber-1, "X");
        drawBoard();
    }

    public void markBoardWithO(String cell) {
        int locationNumber = parseInt(cell);
        boardList.set(locationNumber-1, "O");
        drawBoard();
    }

    public boolean checkIfLocationIsTaken(String cell) {
        if(boardList.contains(cell))
        {
            return false;
        }
            printStream.println("Location Already Taken");

        return true;

    }

    public boolean checkIfBoardIsfull() {
        Boolean result = true;
        for(int cellNum = 1; cellNum<10; cellNum++)
        {
            String cell = Integer.toString(cellNum);
            if(boardList.contains(cell))
            {
                result =false;
            }
        }
        if(result==true)
        {
            printStream.println("Game is a draw");
        }

        return result;

    }
}


