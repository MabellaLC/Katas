package MarsRover;

import java.util.ArrayList;
import java.util.List;

public class CommandsSequence {
    List<Command> commands = new ArrayList<>();

    CommandsSequence(String commandsCodes) {

        for (int i = 0; i < commandsCodes.length(); i++) {
            String commandCode = commandsCodes.substring(i, i + 1);
            commands.add(CommandCodeInterpreter.interprete(commandCode));
        }
    }

    public Vector apply(Vector vector){
        for (Command commandIndex : commands){
            vector = commandIndex.apply(vector);
        }
        return vector;
    }
}
