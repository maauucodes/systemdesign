package TaskManegementSystem.Model;

import java.time.LocalDate;

import TaskManegementSystem.Enums.TaskStatus;


public class Task 
{
    // attributes of a task 
    //assumption : description, assignee, duedate can be nullable

    private int id;
    private String title;
    private String description;   
    private User assignee;
    private LocalDate dueDate;
    private TaskStatus status;

    public Task(Integer id, String title, String description, User assignee, LocalDate dueDate, TaskStatus status)
    {
        if(id==null || title.isEmpty())
        {
            throw new IllegalArgumentException("Task Id and Title cannot be null");
        }

        this.id=id;
        this.title=title;
        this.assignee=assignee;
        this.description=description;
        this.dueDate=dueDate;
        this.status=status;
    }

    public int getTaskId()
    {
        return this.id;
    }
    public LocalDate getTaskDueDate()
    {
        return this.dueDate;
    }
    public User getTaskAssignee()
    {
        return this.assignee;
    }
    public String getTaskTitle()
    {
        return this.title;
    }
    public TaskStatus geTaskStatus()
    {
        return this.status;
    }

    public void updateDueDate(LocalDate date)
    {
        this.dueDate=date;
    }
    public void updateAssignee(User assignee)
    {
        this.assignee=assignee;
    }
    public void updateTitle(String title)
    {
        this.title=title;
    }
    public void updateDescription(String description)
    {
        this.description=description;
    }
    public void updateStatus(TaskStatus status)
    {
        this.status=status;
    }
}
