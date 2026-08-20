import java.time.LocalDate;
import java.util.List;

import TaskManegementSystem.Controller.TaskManager;
import TaskManegementSystem.Model.Task;
import TaskManegementSystem.Model.User;
import TaskManegementSystem.Repository.TaskRepository;
import TaskManegementSystem.Repository.TaskRepositoryImpl;
import TaskManegementSystem.Service.TaskManagerService;

public class Main
{
    public static void main(String[] args)
    {
       testTaskManagementSystem();
       return;
    }

    private static void testTaskManagementSystem()
    {
       TaskRepository repository=new TaskRepositoryImpl();
       TaskManagerService service=new TaskManagerService(repository);
       TaskManager controller=new TaskManager(service);
       User assignee=new User(1,"shambhavi.pandey@gmail.com", "Shambhavi Pandey");

       controller.createTask("Task ManageMent System Implementation",null , assignee, LocalDate.of(2026,12,15));
       List<Task> taskList=controller.getTaskList();

       printTaskList(taskList);
    }
    private static void printTaskList(List<Task> tasks)
    {
        for(int i=0;i<tasks.size();i++)
        {
            System.out.println(tasks.get(i).getTaskId() + ":" + tasks.get(i).getTaskTitle()+", Assignee: "+tasks.get(i).getTaskAssignee().getUserName());
        }
    }
}