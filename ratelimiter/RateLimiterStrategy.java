package ratelimiter;

public interface RateLimiterStrategy {
    public boolean allowRequest(String userId);
}
