package UnitTest;

import Domain.*;
import Domain.ValueObjects.IDtask;
import Domain.ValueObjects.TaskName;
import Exceptions.UnknownCommandEx;
import Infraestructure.InMemoryTaskRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class ToDoListShould {

    TaskRepository taskRepository;
    ConsoleApp console;
    ToDoListApp toDoListApp;

    @BeforeEach
    public void setUp(){
        console = mock(ConsoleApp.class);
       /* taskRepository = mock(TaskRepository.class);
        toDoListApp = new ToDoListApp(taskRepository, console);*/
    }

    @Test
    public void adding_a_task_to_a_repository(){
        taskRepository = mock(TaskRepository.class);
        toDoListApp = new ToDoListApp(taskRepository, console);

        Task task = new Task(new IDtask(1), new TaskName("Limpiar cocina"), "21/04/2020");
        toDoListApp.addTask(task);

        verify(taskRepository).addTask(task);
    }

    @Test
    public void adding_two_tasks_to_a_repository(){
        taskRepository = mock(TaskRepository.class);
        toDoListApp = new ToDoListApp(taskRepository, console);

        Task task = new Task(new IDtask(1), new TaskName("Limpiar cocina"), "21/04/2020");
        Task task2 = new Task(new IDtask(2), new TaskName("Sacar perro"), "21/04/2020");
        toDoListApp.addTask(task);
        toDoListApp.addTask(task2);

        verify(taskRepository).addTask(task);
        verify(taskRepository).addTask(task2);
    }

    @Test
    public void print_two_tasks(){
        taskRepository = mock(TaskRepository.class);
        toDoListApp = new ToDoListApp(taskRepository, console);

        List<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task(new IDtask(1), new TaskName("Limpiar cocina"), "21/04/2020"));
        tasksList.add(new Task(new IDtask(2), new TaskName("Sacar perro"), "21/04/2020"));

        when(taskRepository.getList()).thenReturn(tasksList);

        toDoListApp.printTask();

        verify(console).printLine("ID: 1" + "\n" +
                "Task: Limpiar cocina" + "\n" +
                "Due: 21/04/2020");
        verify(console).printLine("ID: 2" + "\n" +
                "Task: Sacar perro" + "\n" +
                "Due: 21/04/2020");
    }

    @Test
    public void print_task_when_command_is_all(){
        taskRepository = mock(TaskRepository.class);
        toDoListApp = new ToDoListApp(taskRepository, console);

        List<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task(new IDtask(1), new TaskName("Limpiar cocina"), "21/04/2020"));
        tasksList.add(new Task(new IDtask(2), new TaskName("Sacar perro"), "21/04/2020"));

        when(taskRepository.getList()).thenReturn(tasksList);

        toDoListApp.executeCommand("All");

        verify(console).printLine("ID: 1" + "\n" +
                "Task: Limpiar cocina" + "\n" +
                "Due: 21/04/2020");
    }

    @Test
    public void raise_error_when_command_is_not_correct(){
        taskRepository = mock(TaskRepository.class);
        toDoListApp = new ToDoListApp(taskRepository, console);

        assertThrows(UnknownCommandEx.class, () -> toDoListApp.executeCommand("Unknown"));
    }

    @Test
    public void testIncomplete(){
        taskRepository = new InMemoryTaskRepository();
        toDoListApp = new ToDoListApp(taskRepository, console);


        IDtask iDtask = new IDtask(1);
        Task task = new Task(iDtask, new TaskName("Limpiar cocina"), "21/04/2020");
        toDoListApp.addTask(task);
        toDoListApp.completeTask(iDtask);
        Task task2 = new Task(new IDtask(2), new TaskName("Sacar perro"), "21/04/2020");
        toDoListApp.addTask(task2);

        toDoListApp.executeCommand("Incomplete");

        verify(console).printLine("ID: 1" + "\n" +
                "Task: Limpiar cocina" + "\n" +
                "Due: 21/04/2020");

        verify(console).printLine("ID: 2" + "\n" +
                "Task: Sacar perro" + "\n" +
                "Due: 21/04/2020");
                /*+ "\n" +
                "Status: incompleto"*/
    }

    //incomplete command
}
