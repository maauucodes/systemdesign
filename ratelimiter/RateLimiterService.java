package ratelimiter;

import java.util.HashMap;
import java.util.Map;

public class RateLimiterService {
    private Map<Tier, RateLimiterStrategy> rateLimiterStore=new HashMap<>();
    private RateLimiterFactory rateLimiterFactory=new RateLimiterFactory();

    RateLimiterService()
    {
        rateLimiterStore.put(Tier.FREE, rateLimiterFactory.createRateLimiter(new RateLimiterConfig(10, 60), "Tocken_Bucket"));
    }

    public boolean allowRequest(User user)
    {
        String userId=user.getUserId();
        RateLimiterStrategy rateLimiter=rateLimiterStore.get(user.getUserTier());
        return rateLimiter.allowRequest(userId);
    }
}
