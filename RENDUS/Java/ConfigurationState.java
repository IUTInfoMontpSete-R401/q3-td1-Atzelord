public class ConfigurationState extends ChaussetteState {

    public ConfigurationState(SuperChaussette c) {
        super(c);
    }

    @Override
    public void config() {
        chaussette.changeState(new ConnecteeState(chaussette));
    }
}
