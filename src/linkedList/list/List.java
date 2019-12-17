package linkedList.list;

import linkedList.node.ListNode;
import linkedList.node.SingleLinkNode;

/**
 * Interface for a random access data structure
 *
 * @param <T> the type of object to be stored in this list.
 *
 * @author Hugh Osborne
 * @version October 2019
 */

public interface List<T> extends LinkedList<SingleLinkNode<T>,T>
{
    /**
     * Add a new value to the list at position index
     * @param index the index at which the new entry should be added.
     * @param value the value to be added.
     * @throws ListAccessError if index is an invalid index.
     */
    public void add(int index, T value) throws ListAccessError;
    
    /**
     * Remove a value from the list at the index specified.
     * @param index the index of the entry to be removed.
     * @return the value removed.
     * @throws ListAccessError if index is an invalid index.
     */
    public T remove(int index) throws ListAccessError;
    
    /**
     * Get a value from the list at the index specified (do not remove it)
     * @param index the index of the entry to be accessed.
     * @return the value indexed.
     * @throws ListAccessError if index is an invalid index.
     */
    public T get(int index) throws ListAccessError;

}
