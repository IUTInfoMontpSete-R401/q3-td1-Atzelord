package pattern;

import pattern.etat.SocketState;
import pattern.etat.Initial;

public class Socket {
    private SocketState etat;

    public Socket() {
        etat = new Initial(this);
    }

    public SocketState getEtat() {
        return etat;
    }

    public void changeState(SocketState etat) {
        this.etat = etat;
    }

    public void listen() {
        etat.listen();
    }

    public void read() {
        etat.read();
    }

    public void close() {
        etat.close();
    }

    public void connect() {
        etat.connect();
    }

    public void accept() {
        etat.accept();
    }

    public void reset() {
        etat.reset();
    }

    public void config() {
        etat.config();
    }
}
