import java.util.Scanner;

public class Main {

    // fori
    // sout
    public static void main(String[] args) {
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


        int worldWidth = 10;
        int worldHeight = 5;
       //                    parem klõps -> refactor -> extract method
        Player player = new Player(worldWidth, worldHeight);
        Dragon dragon = new Dragon(worldWidth, worldHeight);
        Orc orc = new Orc(worldWidth, worldHeight);

        printMap(worldWidth, worldHeight,
                player.xCoordinaate, player.yCoordinaate, player.symbol,
                dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                orc.xCoordinaate, orc.yCoordinaate, orc.symbol);
        String input = scanner.nextLine();
//        for (; !input.equals("end"); )
        while (!input.equals("end")) {
            player.move(input);
            printMap(worldWidth, worldHeight,
                    player.xCoordinaate, player.yCoordinaate, player.symbol,
                    dragon.xCoordinaate, dragon.yCoordinaate, dragon.symbol,
                    orc.xCoordinaate, orc.yCoordinaate, orc.symbol);
            System.out.println();
            input = scanner.nextLine();
        }
    }

    private static void printMap(int worldWidth, int worldHeight, int playerXCoordinaate, int playerYCoordinaate, char playerSymbol, int dragonXCoordinaate, int dragonYCoordinaate, char dragonSymbol, int orcXCoordinaate, int orcYCoordinaate, char orcSymbol) {
        // algväärtus   kuni   iga tsükkel
        for (int y = 0; y < worldHeight; y++) {
            System.out.println();
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight -1) {
                    System.out.print("-");
                } else if (x == 0 || x == worldWidth -1) {
                    System.out.print("|");
                } else {
//                    ctrl + alt + m
//                    parem klõps -> refactor -> extract method
                    printCharacters(playerXCoordinaate, playerYCoordinaate, playerSymbol,
                            dragonXCoordinaate, dragonYCoordinaate, dragonSymbol,
                            orcXCoordinaate, orcYCoordinaate, orcSymbol, y, x);
                }
            }
        }
    }

    // int on tagastustüüp ehk mis järgneb return kirjele
    private static int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
                // returni järel tuleb täisarv
    }

    // void on tagastustüüp ehk mis tüüp järgneb return kirjele
            // void tähendab, et ei tagastatagi midagi
    private static void printCharacters(int playerXCoordinaate, int playerYCoordinaate, char playerSymbol,
                                        int dragonXCoordinaate, int dragonYCoordinaate, char dragonSymbol,
                                        int orcXCoordinaate, int orcYCoordinaate, char orcSymbol, int mapY, int mapX) {
        if (playerXCoordinaate == mapX && playerYCoordinaate == mapY) {        // aktiveerin + parem klõps + refactor + rename
            System.out.print(playerSymbol);
        } else if (dragonXCoordinaate == mapX && dragonYCoordinaate == mapY) {
            System.out.print(dragonSymbol);
        } else if (orcXCoordinaate == mapX && orcYCoordinaate == mapY) {
            System.out.print(orcSymbol);
        } else {
            System.out.print(" ");
        }
    }
}
