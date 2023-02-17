package pattern.etat;

import pattern.Socket;

public abstract class SocketState {
    protected Socket socket;

    public void listen() {}

    public void read() {}

    public void close() {}

    public void connect() {}

    public void accept() {}

    public void reset() {}

    public void config() {}
}
