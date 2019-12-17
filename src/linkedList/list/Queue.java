package linkedList.list;

import linkedList.node.DoubleLinkNode;

/**
 * Interface for a FIFO data structure
 *
 * @param <T> the type of object to be stored in this queue.
 *
 * @author Hugh Osborne
 * @version October 2019
 */

public interface Queue<T> extends LinkedList<DoubleLinkNode<T>,T>
{
    /**
     * Add a value to the queue.
     *
     * @param value the value to be added.
     */
    public void enqueue(T value);
    
    /**
     * Remove a value from the queue
     * @return the oldest value in the queue
     * @throws ListAccessError if the queue is empty
     */
    public T dequeue() throws ListAccessError;
}
