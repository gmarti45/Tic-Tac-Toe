import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by gmartine on 1/13/17.
 */
public class InputTest {
    Input input;
    private PrintStream printStream;
    private BufferedReader bufferedReader;


    @Before
    public void setUp()
    {
        bufferedReader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        input = new Input(printStream, bufferedReader);
    }

    @Test
    public void shouldGetNumberFromUser() throws IOException {
        when(bufferedReader.readLine()).thenReturn("3");
        assertThat(input.askPlayerXMark(), is("3"));
    }


}
