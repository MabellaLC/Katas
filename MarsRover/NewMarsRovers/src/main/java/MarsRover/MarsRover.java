package MarsRover;

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
        int displacement = -1;
        if (commandsSequence.equals("f")) {
            displacement = 1;
        }
        if (direction.equals("N")) {
            coordinates = coordinates.add(new Coordinates(0, displacement));
        }else if (direction.equals("E")){
            coordinates = coordinates.add(new Coordinates(displacement ,0));
        }else if (direction.equals("S")){
            coordinates = coordinates.add(new Coordinates(0, -displacement));
        }else {
            coordinates = coordinates.add(new Coordinates(-displacement, 0));
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
        return "MarsRover.MarsRover{" +
                "direction='" + direction + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
