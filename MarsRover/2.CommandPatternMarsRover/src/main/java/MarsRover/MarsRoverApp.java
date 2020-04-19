package MarsRover;

import MarsRover.Commands.ICommands;

public class MarsRoverApp {

    InvokerMars invoker;
    MarsRoverReceiver marsRover;
    public MarsRoverApp(int Xcoordinate, int Ycoordinate, String orientation) {
        marsRover = new MarsRoverReceiver(Xcoordinate, Ycoordinate, orientation);
        this.invoker = new InvokerMars();
    }

    public MarsRoverApp move(String command) {
        execute(createCommand(command));
       return marsRover.updateMarsRover();
    }

    private void execute(ICommands iCommands){
        marsRover = iCommands.execute(marsRover);
    }

    private ICommands createCommand(String command){

        return invoker.parseCommand(command);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRoverApp that = (MarsRoverApp) o;

        return marsRover !=null ? marsRover.equals(that.marsRover) : that.marsRover == null;

    }

    @Override
    public int hashCode() {
        return marsRover != null ? marsRover.hashCode() : 0;
    }


}
