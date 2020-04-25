package MarsRover;

import java.util.Objects;

public class MarsRover {
    private Vector vector;

    public MarsRover(int x, int y, String directionCode) {
        this.vector = new Vector(new Coordinates(x, y), Direction.pointingTo(directionCode));
    }

    public void receive(String commandsSequence) {
        if (commandsSequence.equals("")) {
            return;
        }
        for (int i=0; i < commandsSequence.length(); i++){
            String commandCode = commandsSequence.substring(i, i+1);
            applyCommand(commandCode);
        }
    }

    private void applyCommand(String commandCode) {
        if (isRightRotation(commandCode)) {
            rotateRight();
        } else if (isLeftRotation(commandCode)) {
            rotateLeft();
        } else {
            move(commandCode);
        }
    }

    private boolean isLeftRotation(String commandCode) {
        return commandCode.equals("l");
    }

    private boolean isRightRotation(String commandCode) {
        return commandCode.equals("r");
    }

    private void rotateLeft() {
        this.vector = vector.rotateLeft();
    }

    private void rotateRight() {
        this.vector = vector.rotateRight();
    }

    private void move(String commandCode) {
        int displacement = getDisplacement(commandCode);
        this.vector = vector.move(displacement);
    }



    private int getDisplacement(String commandCode) {
        final int DISPLACEMENT_LENGHT = 1;
        int displacement = -DISPLACEMENT_LENGHT;
        if (commandCode.equals("f")) {
            displacement = DISPLACEMENT_LENGHT;
        }
        return displacement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRover marsRover = (MarsRover) o;
        return Objects.equals(vector, marsRover.vector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vector);
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "vector=" + vector +
                '}';
    }
}
