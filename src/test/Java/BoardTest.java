import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {

    Board board;
    PrintStream printStream;

    @Before
    public void setUp()
    {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);

    }

    @Test
    public void shouldPrintBoard()
    {
        board.drawBoard();
        verify(printStream).println("1|2|3\n-----\n4|5|6\n-----\n7|8|9\n");
    }

    @Test
    public void shouldRedrawTheBoardWithX()
    {
        board.drawBoard();
        board.redrawBoardX("3");
        verify(printStream).println("1|2|X\n-----\n4|5|6\n-----\n7|8|9\n");
    }

}
