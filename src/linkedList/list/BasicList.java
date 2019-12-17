package linkedList.list;

import linkedList.node.ListNode;

/**
 * Minimal implementation of list objects.
 *
 * Defines the root node, access methods, and test for emptiness.
 *
 * @param <N> the type of node used in this list (for example, single or double linked)
 * @param <T> the type of object stored in this list
 *
 * @author Hugh Osborne
 * @version October 2019
 */
public abstract class BasicList<N extends ListNode<T>,T> implements LinkedList<N,T> {

    /**
     * The root (or first) node in the list.
     * For stacks this is usually referred to as the "top", and for queues as the "head".
     */
    N root;

    /**
     * Is this list empty?
     *
     * @return (the list is empty)
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Get the root node.
     *
     * @return the root node.
     */
    public N getRoot() {
        return root;
    }

    /**
     * Update the root node.
     *
     * @param newRoot the node that is to be the new root.
     */
    public void setRoot(N newRoot) {
        root = newRoot;
    }

    /**
     * Get a String representation of this list.
     * @return a comma separated String list representation of this list.
     */
    public String toString() {
        if (isEmpty()) {
            return "[]";
        } else {
            ListNode<T> currentNode = getRoot();
            StringBuilder string = new StringBuilder("[" + currentNode.getValue());
            while ((currentNode = currentNode.getNext()) != null) {
                string.append("," + currentNode.getValue());
            }
            string.append("]");
            return string.toString();
        }
    }
}
