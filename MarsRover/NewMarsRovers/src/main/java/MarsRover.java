import java.util.Objects;

public class MarsRover {
    private final String direction;
    private Coordinates coordinates;

    public MarsRover(int x, int y, String direction) {
        this.direction = direction;
        this.coordinates = new Coordinates(x, y);
    }

    private void setCoordinates(int x, int y){
           this.coordinates = new Coordinates(x, y);
    }

    public void receive(String commandsSequence) {
        if (commandsSequence.equals("")) {
            return;
        }
        if (direction.equals("N")) {
            setCoordinates(coordinates.x(),coordinates.y() + 1);
        }
        else if (direction.equals("E")) {
            setCoordinates(coordinates.x() + 1, coordinates.y());
        }else if (direction.equals("S")){
            setCoordinates(coordinates.x(), coordinates.y() - 1);;
        }else {
            setCoordinates(coordinates.x() - 1, coordinates.y());
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRover marsRover = (MarsRover) o;
        return coordinates.x() == marsRover.coordinates.x() &&
                coordinates.y() == marsRover.coordinates.y() &&
                Objects.equals(direction, marsRover.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinates.x(), coordinates.y(), direction);
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "x=" + coordinates.x() +
                ", y=" + coordinates.y() +
                ", direction=" + direction +
                '}';
    }
}
