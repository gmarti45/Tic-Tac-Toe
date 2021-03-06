import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by gmartine on 1/15/17.
 */
public class PlayerTest {
    private PrintStream printStream;
    private Player player;
    private BufferedReader bufferedReader;
    private Board board;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        player = new Player(printStream, bufferedReader, board);


    }

    @Test
    public void shouldPrintMessageTellingFirstPlayerToMakeMove() throws IOException {
        player.tellFirstPlayerMakeMove();
        verify(printStream).println("Make your move:");
    }

    @Test
    public void shouldPromptFirstPlayerWhenMakingMove() throws IOException {
        when(bufferedReader.readLine()).thenReturn("3");
        assertThat(player.tellFirstPlayerMakeMove(), is("3"));
    }

    @Test
    public void shouldPrintMessageTellingSecondPlayerToMakeMove() throws IOException {
        player.tellSecondPlayerMakeMove();
        verify(printStream).println("Make your move:");
    }

    @Test
    public void shouldPromptSecondPlayerWhenMakingMove() throws IOException {
        when(bufferedReader.readLine()).thenReturn("3");
        assertThat(player.tellSecondPlayerMakeMove(), is("3"));
    }

    @Test
    public void shouldPromptSecondPlayerUntilEnterAvailableLocation() throws IOException {
        when(bufferedReader.readLine()).thenReturn("3").thenReturn("3");
        player.tellSecondPlayerMakeMove();
        verify(printStream).println("Make your move:");
    }

}