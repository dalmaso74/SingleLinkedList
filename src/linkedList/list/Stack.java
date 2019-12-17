package linkedList.list;

import linkedList.node.SingleLinkNode;

/**
 * Interface for a LIFO data structure
 *
 * @param <T> the type of object to be stored in this stack.
 *
 * @author Hugh Osborne
 * @version October 2019
 */

public interface Stack<T> extends LinkedList<SingleLinkNode<T>,T>
{
    /**
     * Push a value to the top of the stack.
     *
     * @param value the value to be pushed to the stack
     */
    public void push(T value);
    
    /**
     * Pop and return a value from the top of the stack.
     * @return the topmost value on the stack
     * @throws ListAccessError if the stack is empty
     */
    public T pop() throws ListAccessError;
}
