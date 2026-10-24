package lrucache;

public class DoublyLinkedList<K, V> {
    private Node<K, V> head;
    private Node<K, V> tail;

    DoublyLinkedList()
    {
        head=new Node<K, V>(null, null);
        tail=new Node<K, V>(null, null);
        head.setNext(tail);
        tail.setPrevious(head);
    }

    public  synchronized void addToHead(Node<K, V> node)
    {
        node.setNext(head.getNext());
        node.setPrevious(head);
        head.getNext().setPrevious(node);
        head.setNext(node);
    }
    public void moveToHead( Node<K, V> node)
    {
        // move node to head
    }
    public synchronized K removeFromTail()
    {
        if(head.getNext().equals(tail))
        {
            return null;
        }
        K key=tail.getPrevious().getKey();
        tail.getPrevious().getPrevious().setNext(tail);
        tail.setPrevious(tail.getPrevious().getPrevious());

        return key;
    }
}
