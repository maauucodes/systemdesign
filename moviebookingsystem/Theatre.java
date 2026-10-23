package moviebookingsystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Theatre {
    private String theatreId;
    private String theatreName;
    private Map<String, Screen> screens=new HashMap<>();

    Theatre(String theatreId, String theatreName, List<Screen> screens)
    {
        this.theatreId=theatreId;
        this.theatreName=theatreName;

        for(int i=0;i<screens.size();i++)
        {
            screens.put(screens.get(i).getScreenId(), screens.get(i));
        }
    }

    public String getTheatreId()
    {
        return theatreId;
    }
    public String getTheatreName()
    {
        return theatreName;
    }
    public List<Screen> getTheatreScreens()
    {
        return List.of(screens.values());
    }
}
