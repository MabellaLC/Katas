package MarsRover.commands;

import MarsRover.Command;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CommandCodeInterpreter {
    private static final int DISPLACEMENT_LENGHT = 1;
    private static Map<String, Command> knownCommands = knownCommands();

    public static Command interprete(String commandCode){
        if (!knownCommands.containsKey(commandCode)){
            return new UnknownCommand();
        }
        return knownCommands.get(commandCode);
    }

    public static Map<String, Command> knownCommands(){
        knownCommands = new HashMap<>();
        knownCommands.put("f", new Movement(DISPLACEMENT_LENGHT));
        knownCommands.put("b", new Movement(-DISPLACEMENT_LENGHT));
        knownCommands.put("r", new RightRotation());
        knownCommands.put("l", new LeftRotation());
        return Collections.unmodifiableMap(knownCommands);
    }
}
