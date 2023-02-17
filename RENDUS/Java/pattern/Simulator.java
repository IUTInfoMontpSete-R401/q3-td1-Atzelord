package pattern;

import pattern.commande.Commande;
import pattern.commande.UndoableCommande;

import java.util.HashMap;
import java.util.Map;

public class Simulator {
    // publics pour tests
    public Map<String, Commande> commandes;
    public Map<String, UndoableCommande> commandesAnnulables;

    public Simulator() {
        commandes = new HashMap<>();
        commandesAnnulables = new HashMap<>();
    }

    public void setCommande(String nom, Commande act) {
        commandes.put(nom, act);
        if (act instanceof UndoableCommande) {
            commandesAnnulables.put(nom, (UndoableCommande) act);
        }
    }

    public void executeCommande(String nom) {
        commandes.get(nom).executer();
    }

    public void undoCommande(String nom) {
        commandesAnnulables.get(nom).annuler();
    }
}
