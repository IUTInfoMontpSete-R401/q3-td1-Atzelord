package pattern;

import pattern.commande.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        Socket socket = new Socket();
        simulator.setCommande("listen", new Listen(socket));
        simulator.setCommande("read", new Read(socket));
        simulator.setCommande("close", new Close(socket));
        simulator.setCommande("connect", new Connect(socket));
        simulator.setCommande("accept", new Accept(socket));
        simulator.setCommande("reset", new Reset(socket));
        simulator.setCommande("config", new Config(socket));

        List<String> commandes = new ArrayList<>(simulator.commandes.keySet());
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(commandes.size());
            simulator.executeCommande(commandes.get(x));
            System.out.println(socket.getEtat().toString());
        }
    }
}
