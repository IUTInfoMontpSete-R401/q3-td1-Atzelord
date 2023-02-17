package pattern.commande;

import pattern.Socket;

public class Listen extends Commande {

    public Listen(Socket s) {
        socket = s;
    }

    @Override
    public void executer() {
        socket.listen();
    }
}
