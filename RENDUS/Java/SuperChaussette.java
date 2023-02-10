public class SuperChaussette {
    private ChaussetteState etat;

    public SuperChaussette() {
        etat = new InitialState(this);
    }

    public ChaussetteState getEtat() {
        return etat;
    }

    public void changeState(ChaussetteState etat) {
        this.etat = etat;
    }

    public void listen() {
        etat.listen();
    }

    public void read() {
        etat.read();
    }

    public void close() {
        etat.close();
    }

    public void connect() {
        etat.connect();
    }

    public void accept() {
        etat.accept();
    }

    public void reset() {
        etat.reset();
    }

    public void config() {
        etat.config();
    }
}
