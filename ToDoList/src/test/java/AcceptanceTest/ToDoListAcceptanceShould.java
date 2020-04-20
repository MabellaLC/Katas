package AcceptanceTest;

import Domain.*;
import Domain.ValueObjects.IDtask;
import Domain.ValueObjects.TaskName;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.*;

public class ToDoListAcceptanceShould {
    @Test
    public void test(){
        ConsoleApp console = mock(ConsoleApp.class);
        TaskRepository taskRepository = mock(TaskRepository.class);
        ToDoListApp toDoList = new ToDoListApp(taskRepository, console);

        IDtask taskIncom = new IDtask(1);
        toDoList.addTask(new Task(taskIncom , new TaskName("Ir al medico"), "21/02/2020"));
        toDoList.addTask(new Task(new IDtask(2) , new TaskName("Comprar sandia"), "21/02/2020"));

        toDoList.completeTask(taskIncom);

        toDoList.executeCommand("Incomplete");

        verify(console).printLine("ID: 2" + "\n" +
                                        "Task: Comprar sandia" + "\n" +
                                        "Due: 21/04/2020");
    }
}
