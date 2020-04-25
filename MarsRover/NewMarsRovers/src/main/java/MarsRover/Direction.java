package MarsRover;

public enum Direction {
    NORTH, SOUTH;

    public static Direction pointingTo(String direction) {
        if (direction.equals("N")){

            return NORTH;
        }
        return SOUTH;
    }
}
