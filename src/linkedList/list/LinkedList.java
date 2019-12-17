package linkedList.list;

import linkedList.node.ListNode;

/**
 * Basic interface for linear lists.
 * This interface will be extended to define stacks, queues and lists
 * 
 * @author Hugh Osborne 
 * @version October 2019
 *
 * @param <T> the type of object in this list
 * @param <N> the type of node used in this list
 */

public interface LinkedList<N extends ListNode<T>,T>
{
    /**
     * Report if the list is empty
     * @return (list is empty)
     */
    public boolean isEmpty();
}
