package lrucache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LRUCacheService<K, V> {

    private LRUCache<K, V> lruCache;

    LRUCacheService(int size)
    {
        lruCache=new LRUCache<>(size);
    }

    public void put(K key, V value)
    {
        lruCache.put(key, value);
    }
    public void get(K key)
    {
        lruCache.get(key);
    }
}
