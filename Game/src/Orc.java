public class Orc {
    int xCoordinaate;
    int yCoordinaate;
    char symbol;

    public Orc(int worldWidth, int worldHeight) {
        this.xCoordinaate = getRandomCoordinaate(worldWidth);
        this.yCoordinaate = getRandomCoordinaate(worldHeight);
        this.symbol = 'O';
    }

    private static int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
