package MarsRover;

public enum Direction {
    NORTH{
        @Override
        public Coordinates move(Coordinates coordinates, int displacement){
            return coordinates.add(new Coordinates(0, displacement));
        }
        @Override
        public Direction rotateRight(){
            return Direction.EAST;
        }

    }, SOUTH{
        @Override
        public Coordinates move(Coordinates coordinates, int displacement){
            return coordinates.add(new Coordinates(0, -displacement));
        }
        @Override
        public Direction rotateRight(){
            return Direction.WEST;
        }
    }, EAST{
        @Override
        public Coordinates move(Coordinates coordinates, int displacement){
            return coordinates.add(new Coordinates(displacement ,0));
        }
        @Override
        public Direction rotateRight(){
            return Direction.SOUTH;
        }
    }, WEST{
        @Override
        public Coordinates move(Coordinates coordinates, int displacement){
            return coordinates.add(new Coordinates(-displacement, 0));
        }
        @Override
        public Direction rotateRight(){
            return Direction.NORTH;
        }
    };

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

//when is an enum, this function will be an abstraction(like a parent)
    public abstract Coordinates move(Coordinates coordinates, int displacement);

    public abstract Direction rotateRight();
}
