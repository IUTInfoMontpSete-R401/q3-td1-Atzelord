package pattern.etat;

import pattern.Socket;

public class Initial extends SocketState {

    public Initial(Socket s) {
        socket = s;
    }

    @Override
    public void listen() {
        socket.changeState(new Ecoute(socket));
    }

    @Override
    public void connect() {
        socket.changeState(new Connectee(socket));
    }

    @Override
    public String toString() {
        return "Initial";
    }
}
