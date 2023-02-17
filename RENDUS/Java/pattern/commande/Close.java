package pattern.commande;

import pattern.Socket;

public class Close extends Commande {

    public Close(Socket s) {
        socket = s;
    }

    @Override
    public void executer() {
        socket.close();
    }
}
