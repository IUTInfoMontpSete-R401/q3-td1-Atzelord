import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChaussetteTest {

    @Test
    public void chaqueEtatDixFois() {
        SuperChaussette chaussette = new SuperChaussette();

        for (int i = 0; i < 10; i++) {
            chaussette.listen();
            chaussette.accept();
            chaussette.config();
            chaussette.close();
            chaussette.reset();
        }

        assertEquals(InitialState.class, chaussette.getEtat().getClass());
    }
}
