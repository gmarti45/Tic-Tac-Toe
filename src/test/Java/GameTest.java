import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class GameTest {

    private Board board;
    private Game game;
    private PrintStream printStream;

    @Before
    public void setUp()
    {
        board = mock(Board.class);
        printStream = mock(PrintStream.class);
        game = new Game(printStream, board);


    }

    @Test
    public void shouldDrawBoardWhenStarting()
    {
        game.start();
        verify(board).drawBoard();
    }

    @Test
    public void shouldTellFirstPlayerToMakeMoveWhenStarting()
    {
        game.tellFirstPlayerMakeMove();
        verify(printStream).println("Make your move:");
    }


}