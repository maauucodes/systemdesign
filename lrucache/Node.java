package lrucache;

public class Node<K , V> {
    private K key;
    private V value;
    private Node next;
    private Node prev;

    Node(K key, V value)
    {
        this.key=key;
        this.value=value;
        this.next=null;
        this.prev=null;
    }
    
    public V getValue()
    {
        return value;
    }
    public K getKey()
    {
        return key;
    }
    public Node<K, V> getNext()
    {
        return next;
    }
     public Node<K, V> getPrevious()
    {
        return prev;
    }
    public void setNext(Node<K, V> node)
    {
        next=node;
    }
    public void setPrevious(Node<K, V> node)
    {
        prev=node;
    }
}
