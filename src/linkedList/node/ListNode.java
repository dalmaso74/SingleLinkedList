package linkedList.node;

/**
 * The list node interface.
 * A node is used to contain a value in the list, and connection(s) (pointer(s)) to neighbouring node(s) in the list.
 * At a minimum, a list node must link to one other list node.  This minimal link is considered the forward pointing
 * link, providing the basic linkage for lists.  Extended linkings are also possible.
 *
 * @param <T> the type of object contained in this node
 *
 * @author Hugh Osborne
 * @version October 2019
 */
public interface ListNode<T> {

    /**
     * Get the value contained in this node.
     * @return the value in this node.
     */
    public T getValue();

    /**
     * Get the next node.
     * @return the next node (the node this node (forward) links to).
     */
    public ListNode<T> getNext();
}
