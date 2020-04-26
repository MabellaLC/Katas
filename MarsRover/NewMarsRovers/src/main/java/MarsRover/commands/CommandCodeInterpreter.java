package MarsRover.commands;

import MarsRover.Command;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CommandCodeInterpreter {
    private static final int DISPLACEMENT_LENGHT = 1;
    private static final String FORWARD_MOVEMENT = "f";
    private static final String BACKWARD_MOVEMENT = "b";
    private static final String RIGHT_ROTATION = "r";
    private static final String LEFT_ROTATION = "l";
    private static Map<String, Command> knownCommands = knownCommands();

    public static Command interprete(String commandCode){
        if (isUnknown(commandCode)){
            return new UnknownCommand();
        }
        return getCommand(commandCode);
    }

    private static Command getCommand(String commandCode) {
        return knownCommands.get(commandCode);
    }

    private static boolean isUnknown(String commandCode) {
        return !knownCommands.containsKey(commandCode);
    }

    public static Map<String, Command> knownCommands(){
        knownCommands = new HashMap<>();
        knownCommands.put(FORWARD_MOVEMENT, new Movement(DISPLACEMENT_LENGHT));
        knownCommands.put(BACKWARD_MOVEMENT, new Movement(-DISPLACEMENT_LENGHT));
        knownCommands.put(RIGHT_ROTATION, new RightRotation());
        knownCommands.put(LEFT_ROTATION, new LeftRotation());
        return Collections.unmodifiableMap(knownCommands);
    }
}
