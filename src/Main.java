import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        Client client = new Client();
        ChairFactory chair = new ChairFactory();
        ChairFactory chairFactory;
        if (input.equals("Func")){
            client.setChair(chair.createFunctionalChair());
            client.chair.sum(12, 13);
        }
        else if (input.equals("Victorian")) {
            client.setChair(chair.createVictorianChair());
            client.chair.doMagic();
        }
        else if (input.equals("MagicChair")) {
            client.setChair(chair.createMagicChair());
        }

    }

}
