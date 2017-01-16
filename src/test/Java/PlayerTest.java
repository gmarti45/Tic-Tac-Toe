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

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        player = new Player(printStream, bufferedReader);


    }

    @Test
    public void shouldPrintMessageTellingFirstPlayerToMakeMove() throws IOException {
        player.tellFirstPlayerMakeMove();
        verify(printStream).println("Make your move:");
    }

    @Test
    public void shouldPromptUserWhenMakingMove() throws IOException {
        when(bufferedReader.readLine()).thenReturn("3");
        assertThat(player.tellFirstPlayerMakeMove(), is("3"));
    }

}