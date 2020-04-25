package MarsRover;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MarsRover {
    private Vector vector;

    public MarsRover(int x, int y, String directionCode) {
        this.vector = new Vector(new Coordinates(x, y), Direction.pointingTo(directionCode));
    }

    public void receive(String commandsSequence) {
        List<Command> commands = new ArrayList<>();

        for (int i=0; i < commandsSequence.length(); i++) {
            String commandCode = commandsSequence.substring(i, i + 1);
            if (isRightRotation(commandCode)) {
                commands.add(new RightRotation());
            } else if (isLeftRotation(commandCode)) {
                commands.add(new LeftRotation());
            } else {
                int displacement = getDisplacement(commandCode);
                commands.add(new Movement(displacement));
            }
        }

        for (Command commandIndex : commands){
            vector = commandIndex.apply(vector);
        }
    }

    private boolean isLeftRotation(String commandCode) {
        return commandCode.equals("l");
    }

    private boolean isRightRotation(String commandCode) {
        return commandCode.equals("r");
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
