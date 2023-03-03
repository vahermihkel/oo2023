public class Item {
    int xCoordinate;
    int yCoordinate;
    int strength;
    int durability;
    String name;

    // parem klõps -> generate -> constructor -> vajutan ctrl peal hoides kõigi peale
    public Item(int strength, int durability, String name, int worldWidth, int worldHeight) {
        this.xCoordinate = getRandomCoordinate(worldWidth);
        this.yCoordinate = getRandomCoordinate(worldHeight);
        this.strength = strength;
        this.durability = durability;
        this.name = name;
    }

    private static int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
