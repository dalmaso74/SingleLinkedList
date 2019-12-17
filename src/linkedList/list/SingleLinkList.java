package linkedList.list;

import linkedList.node.ListNode;
import linkedList.node.SingleLinkNode;
import org.w3c.dom.Node;

/**
 * @param <T> generic parameter
 */
public class SingleLinkList<T> extends BasicList<SingleLinkNode<T>,T> implements List<T> {


    /**
     * ADD method works by checking if the index has a root
     * it then index is zero it would then set a root new root
     * otherwise it would be a node and it would move it back by inserting the index before it
     * @param index the index at which the new entry should be added.
     * @param value the value to be added.
     * @throws ListAccessError incorrect index being added
     */
    @Override
    public void add(int index, T value) throws ListAccessError {

        if (isEmpty()) {
            if (index >=1)
            throw new ListAccessError ("index is empty you have to set a root");
        }

        if (index ==0 ){
            SingleLinkNode <T> node = getRoot();
            setRoot(new SingleLinkNode<>(value,node));
        }
        else {

            SingleLinkNode<T> previousNode = getNode(index -1);
            SingleLinkNode<T> newNode = new SingleLinkNode<>(value,previousNode.getNext());
            previousNode.setNext(newNode);
            }
        }

    /**
     * @param index of the entry to be removed, the object with value
     * @return root value
     * @throws ListAccessError incorrect index being added
     */
    @Override
    public T remove(int index) throws ListAccessError {
        if (isEmpty()) {
            throw new ListAccessError("Error index is empty can't remove");
        } else if (index == 0) {
            //gets the next root and returns the value
            setRoot(getRoot().getNext());
            return getRoot().getValue();

        } else {
            //removing a node from the list and setting the next node null
            //if its the last index
            //making sure you can remove the last index
            T temp = getNode(index).getValue();

            if (getNode(index).getNext()==null)
            {
                getNode(index-1).setNext(null);
            }else {
                getNode(index - 1).setNext(getNode(index + 1));
            }
            return temp;
        }
    }

    /**
     * @param index the index of the entry to be accessed.
     * @return the get node
     * @throws ListAccessError when trying to do add or remove out of bound
     */
    @Override
    public T get(int index) throws ListAccessError {
        return getNode(index).getValue();
    }

    private SingleLinkNode<T> getNode(int index) throws ListAccessError{
        SingleLinkNode tempNode = getRoot();
        // for loops finds the node from the index for add and  remove to function
        for (int i = 0; i < index; i++){
            if (tempNode.getNext() == null)
            {
                throw new ListAccessError("cannot accses the placement of the node" );
            }
            else {
                tempNode = tempNode.getNext();
            }
        }

        return tempNode;
    }



}

