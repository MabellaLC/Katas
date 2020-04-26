package MarsRover.commands;

import MarsRover.Command;

public class CommandCodeInterpreter {
    private static final int DISPLACEMENT_LENGHT = 1;
    public static Command interprete(String commandCode){
        if (isRightRotation(commandCode)) {
            return new RightRotation();
        } else if (isLeftRotation(commandCode)) {
            return new LeftRotation();
        } else if(isForwardMovement(commandCode) ) {
            return new Movement(DISPLACEMENT_LENGHT);
        } else if( isBackwardMovement(commandCode)) {
            return new Movement(-DISPLACEMENT_LENGHT);
        }else {
            return new UnknownCommand();
        }

    }

    private static boolean isForwardMovement(String commandCode) {
        return commandCode.equals("f");
    }

    private static boolean isBackwardMovement(String commandCode) {
        return commandCode.equals("b");
    }

    private static boolean isLeftRotation(String commandCode) {
        return commandCode.equals("l");
    }

    private static boolean isRightRotation(String commandCode) {
        return commandCode.equals("r");
    }

}
