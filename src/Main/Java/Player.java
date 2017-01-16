import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by gmartine on 1/15/17.
 */
public class Player {
    private BufferedReader bufferedReader;
    PrintStream printStream;

    Player(PrintStream printStream, BufferedReader bufferedReader)
    {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public String tellFirstPlayerMakeMove() throws IOException {
        printStream.println("Make your move:");
        String moveEntered = bufferedReader.readLine();
        return moveEntered;
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
