package MarsRover;

import java.util.ArrayList;
import java.util.List;

public class CommandsSequence {
    List<Command> commands = new ArrayList<>();

    CommandsSequence(String commandsCodes) {

        for (int i = 0; i < commandsCodes.length(); i++) {
            String commandCode = commandsCodes.substring(i, i + 1);
            if (isRightRotation(commandCode)) {
                commands.add(new RightRotation());
            } else if (isLeftRotation(commandCode)) {
                commands.add(new LeftRotation());
            } else {
                int displacement = getDisplacement(commandCode);
                commands.add(new Movement(displacement));
            }
        }
    }

    public Vector apply(Vector vector){

        for (Command commandIndex : commands){
            vector = commandIndex.apply(vector);
        }
        return vector;
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
}
