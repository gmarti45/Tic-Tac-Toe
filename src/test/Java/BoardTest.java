import org.junit.Before;
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
        verify(printStream).println("1|2|3 \n ----- \n 4|5|6 \n ----- \n 7|8|9 \n");
    }

}
