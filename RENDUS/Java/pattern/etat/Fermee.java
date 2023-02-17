package pattern.etat;

import pattern.Socket;

public class Fermee extends SocketState {

    public Fermee(Socket s) {
        socket = s;
    }

    @Override
    public void reset() {
        socket.changeState(new Initial(socket));
    }

    @Override
    public String toString() {
        return "Fermée";
    }
}
