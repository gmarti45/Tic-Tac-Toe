import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by gmartine on 1/15/17.
 */
public class Player {
    private final BufferedReader bufferedReader;
    PrintStream printStream;

    Player(PrintStream printStream, BufferedReader bufferedReader)
    {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public String tellFirstPlayerMakeMove() {
        printStream.println("Make your move:");
        String numberEntered = readLine();
        return numberEntered;
    }
    private String readLine() {
        String numberEntered = null;
        try {
            numberEntered  = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberEntered ;
    }
}
