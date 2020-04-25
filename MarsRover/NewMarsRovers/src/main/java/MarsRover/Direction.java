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


    public Coordinates move(Coordinates coordinates, int displacement) {
        if (this.equals(Direction.NORTH)){
            return coordinates.add(new Coordinates(0, displacement));
        }else if (this.equals(Direction.EAST)){
            return coordinates.add(new Coordinates(displacement ,0));
        }else if (this.equals(Direction.SOUTH)) {
            return coordinates.add(new Coordinates(0, -displacement));
        }else {
            return coordinates.add(new Coordinates(-displacement, 0));

        }
    }
}
