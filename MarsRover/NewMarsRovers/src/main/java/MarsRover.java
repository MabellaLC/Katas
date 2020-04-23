import java.util.Objects;

public class MarsRover {
    private int x;
    private int y;
    private final String direction;

    public MarsRover(int x, int y, String direction) {

        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void receive(String commandsSequence) {
        if (commandsSequence.equals("")) {
            return;
        }
        if (direction.equals("N")) {
            y += 1;
        }
        else if (direction.equals("E")) {
            x += 1;
        } else {
            y -= 1;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRover marsRover = (MarsRover) o;
        return x == marsRover.x &&
                y == marsRover.y &&
                Objects.equals(direction, marsRover.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, direction);
    }
}
