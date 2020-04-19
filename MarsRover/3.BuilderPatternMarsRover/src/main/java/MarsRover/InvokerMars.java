package MarsRover;

import MarsRover.CommandPattern.*;

public class InvokerMars {

    public ICommands parseCommand(String command) {
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
