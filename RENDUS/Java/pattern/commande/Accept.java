package pattern.commande;

import pattern.Socket;

public class Accept extends Commande {

    public Accept(Socket s) {
        socket = s;
    }

    @Override
    public void executer() {
        socket.accept();
    }
}
