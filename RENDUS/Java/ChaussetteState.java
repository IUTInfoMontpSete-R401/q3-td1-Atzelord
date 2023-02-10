public abstract class ChaussetteState {
    protected SuperChaussette chaussette;

    public ChaussetteState(SuperChaussette c) {
        this.chaussette = c;
    }

    public void listen() {
        showError();
    }

    public void read() {
        showError();
    }

    public void close() {
        showError();
    }

    public void connect() {
        showError();
    }

    public void accept() {
        showError();
    }

    public void reset() {
        showError();
    }

    public void config() {
        showError();
    }

    public void showError() {
        System.out.println("N'importe quoi");
    }
}
