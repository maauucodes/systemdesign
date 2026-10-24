package lrucache;

public class DoublyLinkedList<K, V> {
    private Node<K, V> head;
    private Node<K, V> tail;

    DoublyLinkedList()
    {
        head=null;
        tail=null;
        head.setNext(tail);
        tail.setPrevious(head);
    }

    public  synchronized void addToHead(Node<K, V> node)
    {
        node.setNext(head.getNext());
        node.setPrevious(head);
        head.getNext().setPrevious(node);
    }
    public void addToTail( Node<K, V> node)
    {
        node.setPrevious(tail.getPrevious());
        tail.getPrevious().setNext(node);
        node.setNext(tail);
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
