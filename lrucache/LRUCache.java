package lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache<K, V> {
    int capacity;
    private Map<K, Node<K, V>> cache=new HashMap<>();
    private DoublyLinkedList<K, V> doublyLinkedList;

    LRUCache(int capacity)
    {
        this.capacity=capacity;
        doublyLinkedList=new DoublyLinkedList<>();
    }

    public synchronized void put(K key, V value)
    {
        if(cache.size()==capacity)
        {
            K removedKey=doublyLinkedList.removeFromTail();
            cache.remove(removedKey);
            System.out.println(removedKey+" was removed from the cache");
        }
        Node<K, V> node=new Node<K, V>(key, value);
        doublyLinkedList.addToHead(node);
        cache.put(key, node);
        System.out.println("The key has been added to the cache");
    }
    public synchronized V get(K key)
    {
       if(cache.containsKey((key)))
       {
         doublyLinkedList.addToHead(cache.get(key));
         return cache.get(key).getValue();
       }
       System.out.println("The key doesnt exist in the cache");
       return null;
    }
}
