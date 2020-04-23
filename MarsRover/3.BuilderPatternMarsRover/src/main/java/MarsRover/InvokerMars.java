package MarsRover;

import MarsRover.CommandPattern.*;

import java.util.ArrayList;
import java.util.List;

public class InvokerMars {

    public List<Commands> createCommands(String command) {
        List<Commands> iCommandsList = new ArrayList<>();
        for (String letterCommand : splitCommand(command)){
            iCommandsList.add(parseCommand(letterCommand));
        }
        return iCommandsList;
    }

    private String[] splitCommand(String command){
        return command.split("");
    }

    public Commands parseCommand(String command) {
        if (command.equals("f") ){
            return new Fordware();
        }
        if (command.equals("r") ){
            return new Right();
        }
        if (command.equals("b") ){
            return new Backward();
        }
        if (command.equals("l") ){
            return new Left();
        }

        return new UnknownCommand();
    }
}
