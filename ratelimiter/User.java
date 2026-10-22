package ratelimiter;

public class User {
    private String userId;
    private Tier userTier;

    User(String userId, Tier userTier)
    {
        this.userId=userId;
        this.userTier=userTier;
    }

    public String getUserId()
    {
        return userId;
    }
    public Tier getUserTier()
    {
        return userTier;
    }
}
