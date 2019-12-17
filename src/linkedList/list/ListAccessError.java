package linkedList.list;

/**
 * Error handling for list access
 * 
 * @author Hugh Osborne
 * @version October 2019
 */
public class ListAccessError extends Exception
{
    public ListAccessError(String message) {
        super(message);
    }
}