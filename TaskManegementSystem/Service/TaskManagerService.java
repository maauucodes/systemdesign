package TaskManegementSystem.Service;

import java.time.LocalDate;
import java.util.List;

import TaskManegementSystem.Enums.TaskStatus;
import TaskManegementSystem.Model.Task;
import TaskManegementSystem.Model.User;
import TaskManegementSystem.Repository.TaskRepository;

public class TaskManagerService 
{
    private static int id=1;
    private TaskRepository repository;
   
    public TaskManagerService(TaskRepository repository)
    {
        this.repository=repository;
    }

    public Task createTask(String title, String description, User assignee, LocalDate date)
    {
        Task task=new Task(id++, title, description, assignee, date, TaskStatus.TO_DO);
        repository.insertTask(task);
        return task;
    }
    public List<Task> fetchTaskList()
    {
        return repository.fetchTasks();
    }
    public void updateTask(int taskId, String title, String description, User assignee , LocalDate date, TaskStatus status)
    {
        Task task=findTaskById(taskId);
        
        task.updateTitle(title);
        task.updateDescription(description);
        task.updateDueDate(date);
        task.updateAssignee(assignee);
        task.updateStatus(status);
    }

    private Task findTaskById(int taskId)
    {
        return repository.fetchTaskById(id);
    }
}
