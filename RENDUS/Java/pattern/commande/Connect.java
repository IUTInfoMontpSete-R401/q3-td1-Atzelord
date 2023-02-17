package pattern.commande;

import pattern.Socket;
import pattern.etat.Initial;

public class Connect extends UndoableCommande {

    public Connect(Socket s) {
        socket = s;
    }

    @Override
    public void executer() {
        socket.connect();
    }

    @Override
    public void annuler() {
        socket.changeState(new Initial(socket));
    }
}
