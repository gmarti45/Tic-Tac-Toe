import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public void shouldDrawBoardWhenStarting() throws IOException {
        //List<String> boardList = new ArrayList<String>();
        //boardList.addAll(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        game.start();
        verify(board).drawBoard();
    }

    @Test
    public void shouldTellFirstPlayerMakeMoveWhenStarting() throws IOException {
        game.start();
        verify(player).tellFirstPlayerMakeMove();
    }

    @Test
    public void shouldTellSecondPlayerMakeMoveWhenStarting() throws IOException {
        game.start();
        verify(player).tellSecondPlayerMakeMove();
    }



}