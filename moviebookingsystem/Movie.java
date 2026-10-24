package moviebookingsystem;

public class Movie {
    private String id;
    private String name;
    private long runningLength;

    Movie(String id, String name, long runningLength)
    {
        this.id=id;
        this.name=name;
        this.runningLength=runningLength;
    }

    public String getId()
    {
        return id;
    }
    public long getRunningLength()
    {
        return runningLength;
    }
    public String getName()
    {
        return name;
    }
}
