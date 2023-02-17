import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pattern.Socket;
import pattern.etat.Initial;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SocketTest {
    private Socket socket;

    @BeforeEach
    public void initialiser() {
        socket = new Socket();
    }

    @Test
    public void chaqueEtatDixFois() {
        for (int i = 0; i < 10; i++) {
            socket.listen();
            socket.accept();
            socket.config();
            socket.close();
            socket.reset();
        }
        assertEquals(Initial.class, socket.getEtat().getClass());
    }
}
