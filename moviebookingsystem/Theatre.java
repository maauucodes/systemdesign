package moviebookingsystem;

import java.util.List;

public class Theatre {
    private String theatreId;
    private String theatreName;
    private List<Screen> screens;

    Theatre(String theatreId, String name, List<Screen> screens)
    {
        this.theatreId=theatreId;
        this.theatreName=theatreName;
        this.screens=screens;
    }

    public List<Screen> getScreens()
    {
        return List.copyOf(screens);
    }
}
