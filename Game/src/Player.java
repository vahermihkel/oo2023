public class Player {
    int xCoordinaate; // täisarvuline number
    int yCoordinaate;
    char symbol;

    // constructor
    public Player(int worldWidth, int worldHeight) {
        this.xCoordinaate = getRandomCoordinaate(worldWidth);
        this.yCoordinaate = getRandomCoordinaate(worldHeight);
        this.symbol = 'X';
    }

    private static int getRandomCoordinaate(int worldDimension) {
        // castimine ehk teisendamine ühest tüübist teise
        return (int) (Math.random() * (worldDimension - 2) + 1);
        // returni järel tuleb täisarv
    }

    // public tähendab, et mõni teine klass saab ka seda funktsiooni välja kutsuda
    // private tähendab, et seda funktsiooni saab ainult sellest klassis kasutada
    public void move(String input) {
        if (input.equals("w")) {
            this.yCoordinaate = this.yCoordinaate - 1;
        } else if (input.equals("s")) {
            this.yCoordinaate = this.yCoordinaate + 1;
        } else if (input.equals("a")) {
            this.xCoordinaate = this.xCoordinaate - 1;
        } else if (input.equals("d")) {
            this.xCoordinaate = this.xCoordinaate + 1;
        }
    }
}
