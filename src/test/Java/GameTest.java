import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class GameTest {

    private Board board;
    private Game game;
    private PrintStream printStream;
    private Player player;

    @Before
    public void setUp()
    {
        board = mock(Board.class);
        printStream = mock(PrintStream.class);
        player = mock(Player.class);
        game = new Game(printStream, board, player);


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
        game.start();
        verify(player).tellFirstPlayerMakeMove();
    }


}