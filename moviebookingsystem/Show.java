package moviebookingsystem;

public class Show {
    private Movie movie;
    private Screen screen;
    private int startTime;
    private int endTime;

    Show(Movie movie, Screen screen, int startTime)
    {
        this.movie=movie;
        this.screen=screen;
        this.startTime=startTime;
        this.endTime=startTime+movie.getRunTime();
    }
}
