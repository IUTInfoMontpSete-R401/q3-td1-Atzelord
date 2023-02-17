package pattern.etat;

import pattern.Socket;

public class Connectee extends SocketState {

    public Connectee(Socket s) {
        socket = s;
    }

    @Override
    public void read() {
    }

    @Override
    public void close() {
        socket.changeState(new Fermee(socket));
    }

    @Override
    public String toString() {
        return "Connectée";
    }
}
