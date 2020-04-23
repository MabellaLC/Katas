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
            this.coordinates = coordinates.add(new Coordinates(0, 1));
        }
        else if (direction.equals("E")) {
            this.coordinates = coordinates.add(new Coordinates(1, 0));
        }else if (direction.equals("S")){
            this.coordinates = coordinates.add(new Coordinates(0, -1));
            ;
        }else {
            this.coordinates = coordinates.add(new Coordinates(-1, 0));
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
