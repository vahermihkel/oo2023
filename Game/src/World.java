import java.util.List;

public class World {
    int width;
    int height;

    public World(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printMap(int worldWidth, int worldHeight,
                         int playerXCoordinaate, int playerYCoordinaate, char playerSymbol,
                         int dragonXCoordinaate, int dragonYCoordinaate, char dragonSymbol,
                         int orcXCoordinaate, int orcYCoordinaate, char orcSymbol, List<Item> items) {
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
                    for (Item i: items) {
                        if (i.yCoordinate == y && i.xCoordinate == x) {        // aktiveerin + parem klõps + refactor + rename
                            System.out.print("I");
                        }
                    }
                }
            }
        }
    }

//    // int on tagastustüüp ehk mis järgneb return kirjele
//    private static int getRandomCoordinaate(int worldDimension) {
//        return (int) (Math.random() * (worldDimension - 2) + 1);
//                // returni järel tuleb täisarv
//    }

    // void on tagastustüüp ehk mis tüüp järgneb return kirjele
    // void tähendab, et ei tagastatagi midagi
    private void printCharacters(int playerXCoordinaate, int playerYCoordinaate, char playerSymbol,
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
