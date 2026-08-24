package TaskManegementSystem.Controller;

import java.time.LocalDate;
import java.util.List;

import TaskManegementSystem.Enums.TaskStatus;
import TaskManegementSystem.Model.Task;
import TaskManegementSystem.Model.User;
import TaskManegementSystem.Service.TaskManagerService;

public class TaskManager 
{
    private final TaskManagerService taskManagerService;

    public TaskManager(TaskManagerService taskManagerService)
    {
        this.taskManagerService=taskManagerService;
    }

    public Task createTask(String title, String description, User assignee, LocalDate date)
    {
        Task task=taskManagerService.createTask(title, description, assignee, date);
        return task;
    }
    public void updateTask(int taskId , String title, String description, User assginee, LocalDate date, TaskStatus status)
    {
        taskManagerService.updateTask(taskId, title, description, assginee, date, status);
    }
    public List<Task> getTaskList()
    {
        return taskManagerService.fetchTaskList();
    }
}
