public class EcouteState extends ChaussetteState {

    public EcouteState(SuperChaussette c) {
        super(c);
    }

    @Override
    public void close() {
        chaussette.changeState(new FermeeState(chaussette));
    }

    @Override
    public void accept() {
        chaussette.changeState(new ConfigurationState(chaussette));
    }
}
