package MarsRover;

import java.util.Objects;

public class Vector {
    private final Coordinates coordinatesOriginal;
    private final Direction direction;

    public Vector(Coordinates coordinatesOriginal, Direction direction) {

        this.coordinatesOriginal = coordinatesOriginal;
        this.direction = direction;
    }

    public Coordinates origin() {
        return coordinatesOriginal;
    }

    public Direction direction() {
        return direction;
    }

    public Vector move(int displacement) {
        return new Vector(direction.move(coordinatesOriginal, displacement), direction);
    }

    public Vector rotateRight() {
        return new Vector(coordinatesOriginal, direction.rotateRight());
    }

    @Override
    public String toString() {
        return "Vector{" +
                "coordinatesOriginal=" + coordinatesOriginal +
                ", direction=" + direction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Objects.equals(coordinatesOriginal, vector.coordinatesOriginal) &&
                direction == vector.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinatesOriginal, direction);
    }
}
