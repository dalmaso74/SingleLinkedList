package linkedList.node;

/**
 * Defines a basic linked list node
 *
 * @param <T> the type of object to be stored in these nodes.
 *
 * @author Hugh Osborne 
 * @version October 2019
 */
public class SingleLinkNode<T> implements ListNode<T>
{
  /**
   * The value held in this node.
   */
  private T value;

  /**
   * Pointer to the next node.
   */
  private SingleLinkNode<T> next;

  /**
   *  Constructs a "tail" node --- a node with no following node
   * @param value the value to be contained in this node
   */
  public SingleLinkNode(T value) {
    this.value = value;
    next = null;
  }

  /**
   *  Constructs a "non-tail" node --- a node with following nodes
   * @param value the value to be contained in this node
   * @param next a pointer to the next node in the list
   */
  public SingleLinkNode(T value, SingleLinkNode<T> next) {
    this.value = value;
    this.next = next;
  }

  /**
   * @return the value held in this node
   */
  public T getValue() {
    return value;
  }

  /**
   * @return the next node --- and therefore the rest of the list after this node
   */
  public SingleLinkNode<T> getNext() {
    return next;
  }
  
  /**
   * Set the value of this node's next pointer
   * @param next the new value for the next pointer
   */
  public void setNext(SingleLinkNode<T> next) {
      this.next = next;
    }
}
