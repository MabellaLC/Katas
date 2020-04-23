import java.util.Objects;

public class MarsRover {
    private final String direction;
    private Coordinates coordinates;

    public MarsRover(int x, int y, String direction) {
        this.direction = direction;
        this.coordinates = new Coordinates(x, y);
    }

    public void receive(String commandsSequence) {
        if (commandsSequence.equals("")) {
            return;
        }
        if (direction.equals("N")) {
            this.coordinates = new Coordinates(coordinates.x(), coordinates.y() + 1);
        }
        else if (direction.equals("E")) {
            this.coordinates = new Coordinates(coordinates.x() + 1, coordinates.y());
        }else if (direction.equals("S")){
            this.coordinates = new Coordinates(coordinates.x(), coordinates.y() - 1);
            ;
        }else {
            this.coordinates = new Coordinates(coordinates.x() - 1, coordinates.y());
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRover marsRover = (MarsRover) o;
        return Objects.equals(direction, marsRover.direction) &&
                Objects.equals(coordinates, marsRover.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, coordinates);
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "direction='" + direction + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
