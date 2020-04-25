package MarsRover;

public enum Direction {
    NORTH, SOUTH, EAST;

    public static Direction pointingTo(String direction) {
        if (direction.equals("N")){
            return NORTH;
        }else if (direction.equals("S")){
            return SOUTH;
        }else {
            return EAST;
        }
    }
}
