import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static sun.audio.AudioPlayer.player;

public class BoardTest {

    Board board;
    PrintStream printStream;
    Player player;
    private BufferedReader bufferedReader;

    @Before
    public void setUp()
    {
        bufferedReader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
        player = new Player(printStream, bufferedReader);

    }

    @Test
    public void shouldPrintBoard()
    {
        List<String> boardList = new ArrayList<String>();
        boardList.addAll(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        board.drawBoard(boardList);
        verify(printStream).println("1|2|3\n-----\n4|5|6\n-----\n7|8|9\n");
    }

    @Test
    public void shouldPrintBoardWithXInCell3() throws IOException {
        when(player.tellFirstPlayerMakeMove()).thenReturn("3");
        verify(printStream).println("1|2|X\n-----\n4|5|6\n-----\n7|8|9\n");
    }

}
