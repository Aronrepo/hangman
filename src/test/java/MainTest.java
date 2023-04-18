import com.codecool.testing.Game;
import com.codecool.testing.ListTerminal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testGameGreetUs() {
        ListTerminal terminal = new ListTerminal();
        Game game = new Game(terminal);
        game.start();
        assertTrue(terminal.printedMessageStartingWith("Hello"));
    }
}
