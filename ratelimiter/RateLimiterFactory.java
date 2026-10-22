package ratelimiter;

public class RateLimiterFactory {
    public RateLimiterStrategy createRateLimiter(RateLimiterConfig config, String type)
    {
        return switch(type){
            case "Tocken_Bucket"->new TockenBucketRateLimiter(config);
            default-> throw new IllegalArgumentException("The aksed rate limiter type is not supported");
        };
    }
}
