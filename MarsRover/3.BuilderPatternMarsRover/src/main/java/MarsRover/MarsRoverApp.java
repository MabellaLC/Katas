package MarsRover;

import MarsRover.CommandPattern.ICommands;

import java.util.List;

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

    private void execute(List<ICommands> iCommands){
        for (ICommands icommand: iCommands) {
            marsRover = icommand.execute(marsRover);
        }
    }

    private List<ICommands> createCommand(String command){
        return invoker.createCommands(command);
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
