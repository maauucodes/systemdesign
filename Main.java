import lrucache.LRUCacheService;

public class Main
{
    private static final LRUCacheService<Integer, String> cache =
        new LRUCacheService<Integer, String>(4);
    public static void main(String[] args)
    {
        System.out.println("Hello, Your LRU CACHE has been initialised!");
        cache.put(1, "DP");
        cache.put(2, "Graph");

        String value1=cache.get(1);
        System.out.println("The key you requested has value "+value1);

        cache.put(3,"Greedy");
        cache.put(4,"Binary Search");

        cache.put(5, "Tree");
         String value2=cache.get(5);
        System.out.println("The key you requested has value "+value2);

        cache.get(2);
    }
    
}