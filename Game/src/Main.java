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

        int playerXCoordinaate = 3; // täisarvuline number
        int playerYCoordinaate = 3;
        int dragonXCoordinaate = 6;
        int dragonYCoordinaate = 2;
        int orcXCoordinaate = 5;
        int orcYCoordinaate = 1;


        // algväärtus   kuni   iga tsükkel
        for (int y = 0; y < 5; y++) {
            System.out.println();
            for (int x = 0; x < 10; x++) {
                if (y == 0 || y == 4) {
                    System.out.print("-");
                } else if (x == 0 || x == 9) {
                    System.out.print("|");
                } else {
                    if (playerXCoordinaate == x && playerYCoordinaate == y) {
                        System.out.print("X");
                    } else if (dragonXCoordinaate == x && dragonYCoordinaate == y) {
                        System.out.print("D");
                    } else if (orcXCoordinaate == x && orcYCoordinaate == y) {
                        System.out.print("O");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
