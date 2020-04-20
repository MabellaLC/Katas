package Domain.Commands;

import Domain.Task;
import java.util.List;

public interface ICommand {
    List<Task> execute();
}
