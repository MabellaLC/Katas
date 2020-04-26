package MarsRover.commands;

import MarsRover.Command;

public class CommandCodeInterpreter {
    public static Command interprete(String commandCode){
        if (isRightRotation(commandCode)) {
            return new RightRotation();
        } else if (isLeftRotation(commandCode)) {
            return new LeftRotation();
        } else if(isMovement(commandCode)) {
            int displacement = getDisplacement(commandCode);
            return new Movement(displacement);
        }else {
            return new UnknownCommand();
        }

    }

    private static boolean isMovement(String commandCode) {
        return isForwardMovement(commandCode)  ||  isBackwardMovement(commandCode);
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

    private static int getDisplacement(String commandCode) {
        final int DISPLACEMENT_LENGHT = 1;
        int displacement = -DISPLACEMENT_LENGHT;
        if (commandCode.equals("f")) {
            displacement = DISPLACEMENT_LENGHT;
        }
        return displacement;
    }
}
