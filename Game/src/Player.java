public class Player extends Character {
    Direction direction;
    Item item;

    public Player(int worldWidth, int worldHeight) {
        super(worldWidth, worldHeight, 'X');
        this.direction = Direction.UP;
    }

    // public tähendab, et mõni teine klass saab ka seda funktsiooni välja kutsuda
    // private tähendab, et seda funktsiooni saab ainult sellest klassis kasutada
    public void move(String input, World world) {
        if (input.equals("w")) {
            this.direction = Direction.UP;
        } else if (input.equals("s")) {
            this.direction = Direction.DOWN;
        } else if (input.equals("a")) {
            this.direction = Direction.LEFT;
        } else if (input.equals("d")) {
            this.direction = Direction.RIGHT;
        }
        if (direction.equals(Direction.UP) && this.yCoordinaate > 1) {
            this.yCoordinaate = this.yCoordinaate - 1;
        } else if (direction.equals(Direction.DOWN) && this.yCoordinaate < world.height-2) {
            this.yCoordinaate = this.yCoordinaate + 1;
        } else if (direction.equals(Direction.LEFT) && this.xCoordinaate > 1) {
            this.xCoordinaate = this.xCoordinaate - 1;
        } else if (direction.equals(Direction.RIGHT) && this.xCoordinaate < world.width-2) {
            this.xCoordinaate = this.xCoordinaate + 1;
        }
    }
}
