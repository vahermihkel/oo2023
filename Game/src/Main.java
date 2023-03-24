
import java.util.*;

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
        // MITTE java.lang import
        // saatke printMap sisse hoopis character ja if/else asemel funktsiooni sees forEach tsükkel
        List<Character> characters = new ArrayList<>(Arrays.asList(player, dragon, orc));

        Item sword = new Item(10,1,"Mõõk", world.width, world.height);
        Item hammer = new Item(5,3,"Haamer", world.width, world.height);
        Item boot = new Item(1,10,"Saabas", world.width, world.height);

        // import! java.util.List
        // import: java.util.ArrayList
        //                              import: java.util.Arrays
        // List --> muudetav
        List<Item> items = new ArrayList<>(Arrays.asList(sword, hammer, boot));

//        Item[] items1 = {sword, hammer, boot};
        // Array -> ei ole muudetav (read-only)

        world.printMap(world.width, world.height,
                player.xCoordinaate, player.yCoordinaate, player.symbol,
                dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                orc.xCoordinaate, orc.yCoordinaate, orc.symbol, items);
        String input = scanner.nextLine();
//        for (; !input.equals("end"); )
        while (!input.equals("end")) {
            player.move(input, world);
            world.printMap(world.width, world.height,
                    player.xCoordinaate, player.yCoordinaate, player.symbol,
                    dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                    orc.xCoordinaate, orc.yCoordinaate, orc.symbol, items);
            System.out.println();
            for (Item i : items) {
                if (i.xCoordinate == player.xCoordinaate && i.yCoordinate == player.yCoordinaate) {
                    player.item = i;
                    System.out.println("Korjasid eseme: " + player.item.name);
                    break;
                }
            }
            input = scanner.nextLine();
        }
    }


}
