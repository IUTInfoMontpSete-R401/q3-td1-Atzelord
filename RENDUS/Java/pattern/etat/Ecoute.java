package pattern.etat;

import pattern.Socket;

public class Ecoute extends SocketState {

    public Ecoute(Socket s) {
        socket = s;
    }

    @Override
    public void close() {
        socket.changeState(new Fermee(socket));
    }

    @Override
    public void accept() {
        socket.changeState(new Configuration(socket));
    }

    @Override
    public String toString() {
        return "Ecoute";
    }
}
