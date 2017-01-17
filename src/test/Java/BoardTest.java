import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
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
        List<String> boardList = new ArrayList<String>();
        boardList.addAll(Arrays.asList("1","2","3","4","5","6","7","8","9"));
        board = new Board(printStream, boardList, player);
        player = new Player(printStream, bufferedReader, board);

    }

    @Test
    public void shouldPrintBoard()
    {
        //List<String> boardList = new ArrayList<String>();
        board.drawBoard();
        verify(printStream).println("1|2|3\n-----\n4|5|6\n-----\n7|8|9\n");
    }

    @Test
    public void shouldPrintBoardWithXInCell3() throws IOException {
        board.markBoardWithX("3");
        verify(printStream).println("1|2|X\n-----\n4|5|6\n-----\n7|8|9\n");
    }

    @Test
    public void shouldPrintBoardWithOInCell4andXInCell3() throws IOException {
        board.markBoardWithX("3");
        board.markBoardWithO("4");
        verify(printStream).println("1|2|X\n-----\nO|5|6\n-----\n7|8|9\n");
    }
    @Test
    public void shouldPrintLocationAlreadyTaken() throws IOException {
        board.markBoardWithX("3");
        board.markBoardWithO("4");
        board.checkIfLocationIsTaken("3");
        verify(printStream).println("Location Already Taken");
    }
    @Test
    public void shouldBeTrueThatTheBoardFull() throws IOException {
        board.markBoardWithX("1");
        board.markBoardWithO("2");
        board.markBoardWithX("3");
        board.markBoardWithO("4");
        board.markBoardWithX("5");
        board.markBoardWithO("6");
        board.markBoardWithX("7");
        board.markBoardWithO("8");
        board.markBoardWithX("9");
        board.checkIfBoardIsfull();
        assertThat(board.checkIfBoardIsfull(), is(true));
    }
    @Test
    public void shouldPrintGameIsADraw() throws IOException {
        board.markBoardWithX("1");
        board.markBoardWithO("2");
        board.markBoardWithX("3");
        board.markBoardWithO("4");
        board.markBoardWithX("5");
        board.markBoardWithO("6");
        board.markBoardWithX("7");
        board.markBoardWithO("8");
        board.markBoardWithX("9");
        board.checkIfBoardIsfull();
        verify(printStream).println("Game is a draw");
    }
    @Test
    public void shouldBeFalseThatTheBoardFull() throws IOException {
        board.markBoardWithX("1");
        assertThat(board.checkIfBoardIsfull(), is(false));
    }

    @Test
    public void shouldPrintPlayer1WinsWhenPlayer1FillsARow() throws IOException {
        board.markBoardWithX("1");
        board.markBoardWithX("2");
        board.markBoardWithX("3");
        board.checkIfRowFilled();
        verify(printStream).println("Player 1 Wins!");
    }

    @Test
    public void shouldPrintPlayer2WinsWhenPlayer2FillsARow() throws IOException {
        board.markBoardWithO("1");
        board.markBoardWithO("2");
        board.markBoardWithO("3");
        board.checkIfRowFilled();
        verify(printStream).println("Player 2 Wins!");
    }
    @Test
    public void shouldPrintPlayer1WinsWhenPlayer1FillsAColumn() throws IOException {
        board.markBoardWithX("1");
        board.markBoardWithX("4");
        board.markBoardWithX("7");
        board.checkIfColumnFilled();
        verify(printStream).println("Player 1 Wins!");
    }

    @Test
    public void shouldPrintPlayer2WinsWhenPlayer2FillsAColumn() throws IOException {
        board.markBoardWithO("1");
        board.markBoardWithO("4");
        board.markBoardWithO("7");
        board.checkIfColumnFilled();
        verify(printStream).println("Player 2 Wins!");
    }

    @Test
    public void shouldPrintPlayer1WinsWhenPlayer1FillsADiagonal() throws IOException {
        board.markBoardWithX("1");
        board.markBoardWithX("5");
        board.markBoardWithX("9");
        board.checkIfDiagonalFilled();
        verify(printStream).println("Player 1 Wins!");
    }

    @Test
    public void shouldPrintPlayer2WinsWhenPlayer2FillsADiagonal() throws IOException {
        board.markBoardWithO("7");
        board.markBoardWithO("5");
        board.markBoardWithO("3");
        board.checkIfDiagonalFilled();
        verify(printStream).println("Player 2 Wins!");
    }




}
