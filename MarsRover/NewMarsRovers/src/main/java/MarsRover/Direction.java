package MarsRover;

public enum Direction {
    NORTH, SOUTH, EAST, WEST;

    public static Direction pointingTo(String direction) {
        if (direction.equals("N")){
            return NORTH;
        }else if (direction.equals("S")){
            return SOUTH;
        }else if (direction.equals("E")){
            return EAST;
        }else {
            return WEST;
        }
    }
}
