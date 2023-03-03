import java.util.Random;
import java.util.Scanner;

public class Main {

    // fori
    // sout
    public static void main(String[] args) {
//        Random rand = new Random(); // uus instants
//        Math.random(); // static

        System.out.println("Hello world!");
//        String sonaline = "Sõnaline muutuja";
//        char taheline = 's'; // üks täht
//        double komakohaga = 4213.2312312;
//        float komakohaga2 = 313.123213F;
//        boolean kahendV22rtus = true; // 0 ja 1       2    "y"   "n"
//        byte pisikeNumber = 100;
//        short lyhikeNumber = 312;
//        long pikkNumber = 31312321312L;

        Scanner scanner = new Scanner(System.in);


        World world = new World(10,5);
       //                    parem klõps -> refactor -> extract method
        Player player = new Player(world.width, world.height);
        Dragon dragon = new Dragon(world.width, world.height);
        Orc orc = new Orc(world.width, world.height);

        world.printMap(world.width, world.height,
                player.xCoordinaate, player.yCoordinaate, player.symbol,
                dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                orc.xCoordinaate, orc.yCoordinaate, orc.symbol);
        String input = scanner.nextLine();
//        for (; !input.equals("end"); )
        while (!input.equals("end")) {
            player.move(input, world);
            world.printMap(world.width, world.height,
                    player.xCoordinaate, player.yCoordinaate, player.symbol,
                    dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                    orc.xCoordinaate, orc.yCoordinaate, orc.symbol);
            System.out.println();
            input = scanner.nextLine();
        }
    }


}
