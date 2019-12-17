 package SingleLinkListTestingFolder;
import linkedList.list.ListAccessError;
import linkedList.list.SingleLinkList;
import linkedList.node.SingleLinkNode;
import org.junit.Test;
//import org.junit.Test;
//
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.Assert .*;

 /**
  * this classes tests my linked list for my methods that i created work like i expect for integers
  * the first part of the testing checks if my add works in all of situations like
  *the second part deals with my my remove methord testing that it works like its suppose too
  */
public class SingleLinkListIntegerTest {


    public SingleLinkList<Integer> list;

    private void setsList(){
        list = new SingleLinkList<>();
    }

    private void setsRoot(){

        list.setRoot(new SingleLinkNode<Integer>(11));
    }

     @Test
     public void newRootTest() throws ListAccessError {
         setsList();
         list.add(0, 5);
         assertEquals(5,list.get(0));

     }

     @Test
     public void addRootIntoIndex() throws ListAccessError {
         setsList();
         list.add(0, 2);
         System.out.println(list);

     }

     @Test
     public void addOutOfBoundIndex() throws ListAccessError {
         setsList();
         setsRoot();

         assertThrows(ListAccessError.class, () -> {
                     list.add(58, 9);
                 }
         );
     }

     @Test
     public void removingOutOfBoundIndex() throws ListAccessError {
         setsList();
         setsRoot();

         assertThrows(ListAccessError.class, () -> {
                     list.remove(58);
                 }
         );
     }
    @Test
    public void changingRootIntoIndex() throws ListAccessError {
        setsList();
        setsRoot();
        list.add(0, 5);
        assertEquals(5,list.get(0));
        System.out.println(list);
    }

    @Test
    public void addingMiddleIntoFromIndex() throws ListAccessError {
        setsList();
        setsRoot();
        list.add(1,5);
        list.add(2,10);
        list.add(3,15);
        list.add(4,20);
        list.add(5,25);

        list.add(2,2);
        assertEquals(2,list.get(2));

    }

    @Test
    public void addinglastIntoFromIndex() throws ListAccessError {
        setsList();
        setsRoot();
        list.add(1,5);
        list.add(2,10);
        list.add(3,15);
        list.add(4,20);
        list.add(5,25);

        list.add(0,2);

        assertEquals(25,list.get(6));
        System.out.println(list);
    }

    @Test
    public void removeSecondIndex() throws ListAccessError {
        setsList();
        setsRoot();
        list.add(1,5);
        list.add(2,10);
        list.add(3,15);
        list.add(4,20);
        assertEquals(10,list.remove(2));

    }

    @Test
    public void removeFirstIndex() throws ListAccessError {
        setsList();
        setsRoot();
        list.add(1,5);
        list.add(2,10);
        list.add(3,15);
        list.add(4,20);
        list.add(5,25);
        assertEquals(5,list.remove(1));

    }
    @Test
    public void removeLastIndex() throws ListAccessError {
        setsList();
        setsRoot();
        list.add(1,5);
        list.add(2,10);
        list.add(3,15);
        list.add(4,20);
        list.add(5,25);
        assertEquals(25,list.remove(5));

    }

}
