package moviebookingsystem;

public class Movie {
    private String name;
    private int duration;


    Movie(String name, int duration)
    {
        this.name=name;
        this.duration=duration;
    }

    public String getMovieName()
    {
        return name;
    }
    public int getRunTime()
    {
        return duration;
    }
}
