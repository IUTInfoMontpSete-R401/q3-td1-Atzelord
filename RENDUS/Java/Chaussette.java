public class Chaussette {

    private enum Etat {
        INITIAL,
        ECOUTE,
        CONNECTEE,
        FERMEE
    }

    private Etat etat;

    public Chaussette() {
        etat = Etat.INITIAL;
    }

    public void listen() {
        if (etat == Etat.INITIAL) etat = Etat.ECOUTE;
    }

    public void read() {
        if (etat == Etat.CONNECTEE) System.out.println("salut");
    }

    public void close() {
        if (etat == Etat.ECOUTE || etat == Etat.CONNECTEE) etat = Etat.FERMEE;
    }

    public void connect() {
        if (etat == Etat.INITIAL) etat = Etat.CONNECTEE;
    }

    public void accept() {
        if (etat == Etat.ECOUTE) etat = Etat.CONNECTEE;
    }
}
