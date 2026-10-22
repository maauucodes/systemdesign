package ratelimiter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TockenBucketRateLimiter implements RateLimiterStrategy{
    private RateLimiterConfig config;
    Map<String, TockenBucket> userBucketStore=new ConcurrentHashMap<>();

    TockenBucketRateLimiter(RateLimiterConfig config)
    {
        this.config=config;
    }

    @Override 
    public boolean allowRequest(String userId)
    {
        TockenBucket userBucket=userBucketStore.computeIfAbsent(userId, id->new TockenBucket(config));
        return userBucket.allowRequest();
    }

    static class TockenBucket{
        private int bucketSize;
        private double refillRate;
        private long lastRefillTime;
        private double currentTokens;

        TockenBucket(RateLimiterConfig config)
        {
            this.bucketSize=config.getAllowedRquests();
            this.refillRate=(double)bucketSize/config.getTimeFrame();
            this.lastRefillTime=System.nanoTime();
            this.currentTokens=bucketSize;
        }

        public synchronized boolean allowRequest()
        {
            currentTokens=Math.min(currentTokens+refillRate*(System.currentTimeMillis()-lastRefillTime), bucketSize);
            lastRefillTime=System.nanoTime();

            if(currentTokens>=1.0)
            {
                currentTokens-=1;
                return true;
            }
            return false;
        }
    }
}
