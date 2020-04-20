package Domain.Commands;

import Domain.Task;
import Exceptions.UnknownCommandEx;

import java.util.List;

public class UnknownCommand implements ICommand {
    @Override
    public List<Task> execute() {
        throw new UnknownCommandEx("Unknown command");
    }
}
