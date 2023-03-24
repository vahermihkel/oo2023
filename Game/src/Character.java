public class Character implements WorldObject {
    int xCoordinaate;
    int yCoordinaate;
    char symbol;

    public Character(int worldWidth, int worldHeight, char symbol) {
        this.xCoordinaate = getRandomCoordinate(worldWidth);
        this.yCoordinaate = getRandomCoordinate(worldHeight);
        this.symbol = symbol;
    }

    public int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
