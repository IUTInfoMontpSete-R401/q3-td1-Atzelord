package pattern.commande;

import pattern.Socket;

public class Config extends Commande {

    public Config(Socket s) {
        socket = s;
    }

    @Override
    public void executer() {
        socket.config();
    }
}
