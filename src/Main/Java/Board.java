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

    public boolean checkIfRowFilled(){
        boolean result= false;
        String row1 = boardList.get(0)+boardList.get(1)+boardList.get(2);
        String row2 = boardList.get(3)+boardList.get(4)+boardList.get(5);
        String row3 = boardList.get(6)+boardList.get(7)+boardList.get(8);
        if(row1.equals("XXX")|row2.equals("XXX")|row3.equals("XXX"))
        {
            result = true;
            printStream.println("Player 1 Wins!");
        }
        if(row1.equals("OOO")|row2.equals("OOO")|row3.equals("OOO"))
        {
            result = true;
            printStream.println("Player 2 Wins!");
        }
        return result;


    } public boolean checkIfColumnFilled(){
        boolean result= false;
        String column1 = boardList.get(0)+boardList.get(3)+boardList.get(6);
        String column2 = boardList.get(1)+boardList.get(4)+boardList.get(7);
        String column3 = boardList.get(2)+boardList.get(5)+boardList.get(8);
        if(column1.equals("XXX")|column2.equals("XXX")|column3.equals("XXX"))
        {
            result = true;
            printStream.println("Player 1 Wins!");
        }
        if(column1.equals("OOO")|column2.equals("OOO")|column3.equals("OOO"))
        {
            result = true;
            printStream.println("Player 2 Wins!");
        }
        return result;
    }

    public boolean checkIfDiagonalFilled(){
        boolean result= false;
        String diagonal1 = boardList.get(0)+boardList.get(4)+boardList.get(8);
        String diagonal2 = boardList.get(2)+boardList.get(4)+boardList.get(6);
        if(diagonal1.equals("XXX")|diagonal2.equals("XXX"))
        {
            result = true;
            printStream.println("Player 1 Wins!");
        }
        if(diagonal1.equals("OOO")|diagonal2.equals("OOO"))
        {
            result = true;
            printStream.println("Player 2 Wins!");
        }
        return result;
    }
}


