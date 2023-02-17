package pattern.commande;

import pattern.Socket;
import pattern.etat.Fermee;

public class Reset extends UndoableCommande {

    public Reset(Socket s) {
        socket = s;
    }

    @Override
    public void executer() {
        socket.reset();
    }

    @Override
    public void annuler() {
        socket.changeState(new Fermee(socket));
    }
}
