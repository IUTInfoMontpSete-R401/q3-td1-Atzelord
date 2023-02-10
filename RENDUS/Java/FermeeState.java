public class FermeeState extends ChaussetteState {

    public FermeeState(SuperChaussette c) {
        super(c);
    }

    @Override
    public void reset() {
        chaussette.changeState(new InitialState(chaussette));
    }
}
