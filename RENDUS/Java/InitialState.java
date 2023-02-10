public class InitialState extends ChaussetteState {

    public InitialState(SuperChaussette c) {
        super(c);
    }

    @Override
    public void listen() {
        chaussette.changeState(new EcouteState(chaussette));
    }

    @Override
    public void connect() {
        chaussette.changeState(new ConnecteeState(chaussette));
    }
}
