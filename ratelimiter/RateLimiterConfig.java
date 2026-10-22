package ratelimiter;

public class RateLimiterConfig {
    private int allowedRequests;
    private int timeFrameInSeconds;

    RateLimiterConfig(int allwedRequest, int timeFrameInSeconds)
    {
        this.timeFrameInSeconds=timeFrameInSeconds;
        this.allowedRequests=allwedRequest;
    }

    public int getAllowedRquests()
    {
        return allowedRequests;
    }
    public int getTimeFrame()
    {
        return timeFrameInSeconds;
    }
}
