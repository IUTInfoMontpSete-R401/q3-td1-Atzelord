public class ConnecteeState extends ChaussetteState {

    public ConnecteeState(SuperChaussette c) {
        super(c);
    }

    @Override
    public void read() {
        System.out.println("Salut");
    }

    @Override
    public void close() {
        chaussette.changeState(new FermeeState(chaussette));
    }
}
