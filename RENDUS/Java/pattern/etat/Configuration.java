package pattern.etat;

import pattern.Socket;

public class Configuration extends SocketState {

    public Configuration(Socket s) {
        socket = s;
    }

    @Override
    public void config() {
        socket.changeState(new Connectee(socket));
    }

    @Override
    public String toString() {
        return "Configuration";
    }
}
