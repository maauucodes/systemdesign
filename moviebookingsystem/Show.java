package moviebookingsystem;

public class Show {
    private String showId;
    private Screen screen;
    private String movieName;
    private long start;
    private long end;

    Show(String showId, Screen screen, String movieName, long start, long end)
    {
        this.showId=showId;
        this.screen=screen;
        this.movieName=movieName;
        this.start=start;
        this.end=end;
    }
}
