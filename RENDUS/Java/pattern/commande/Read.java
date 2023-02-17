package pattern.commande;

import pattern.Socket;

public class Read extends Commande {

    public Read(Socket s) {
        socket = s;
    }

    @Override
    public void executer() {
        socket.read();
    }
}
