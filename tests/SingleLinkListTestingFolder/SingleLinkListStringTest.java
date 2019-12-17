 package SingleLinkListTestingFolder;
import linkedList.list.List;
import linkedList.list.ListAccessError;
import linkedList.list.SingleLinkList;
import linkedList.node.SingleLinkNode;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.Assert .*;

 public class SingleLinkListStringTest {


     public SingleLinkList<String> Stringlist;

     private void setList() {
         Stringlist = new SingleLinkList<>();
     }

     private void setStringRoot() {
         Stringlist.setRoot(new SingleLinkNode<String>("1"));

     }

     @Test
     public void addRootIntoIndex() throws ListAccessError {
         setList();
         Stringlist.add(0, "2");
         System.out.println(Stringlist);

     }

     @Test
     public void addOutOfBoundIndex() throws ListAccessError {
         setList();
         setStringRoot();

         assertThrows(ListAccessError.class, () -> {
                     Stringlist.add(58, "9");
                 }
         );
     }

     @Test
     public void removingOutOfBoundIndex() throws ListAccessError {
         setList();
         setStringRoot();

         assertThrows(ListAccessError.class, () -> {
                     Stringlist.remove(58);
                 }
         );
     }


     @Test
     public void AddingIntoMiddleList() throws ListAccessError {
         //setStringRoot();
         setList();
         Stringlist.add(0,"1");
         Stringlist.add(1, "5");
         Stringlist.add(2, "10");
         Stringlist.add(3, "15");
         Stringlist.add(4, "20");
         Stringlist.add(5, "25");

         Stringlist.add(2, "12.5");

         assertEquals("12.5", Stringlist.get(2));
         System.out.println(Stringlist);
     }

     @Test
     public void removeSecondIndex() throws ListAccessError {
         setList();
         setStringRoot();
         Stringlist.add(1,"5");
         Stringlist.add(2,"10");
         Stringlist.add(3,"15");
         Stringlist.add(4,"20");
         Stringlist.add(5,"25");
         assertEquals("10",Stringlist.remove(2));
         System.out.println(Stringlist);
     }

     @Test
     public void removeFirstIndex() throws ListAccessError {
         setList();
         setStringRoot();
         Stringlist.add(1,"5");
         Stringlist.add(2,"10");
         Stringlist.add(3,"15");
         Stringlist.add(4,"20");
         Stringlist.add(5,"25");
         assertEquals("5",Stringlist.remove(1));
         System.out.println(Stringlist);
     }

     @Test
     public void removeLastIndex() throws ListAccessError {
         setList();
         setStringRoot();
         Stringlist.add(1,"12");
         Stringlist.add(2,"13");
         Stringlist.add(3,"20");
         Stringlist.add(4,"15");
         Stringlist.add(5,"10");
         System.out.println(Stringlist);

         assertEquals("10",Stringlist.remove(5));
         System.out.println(Stringlist);

     }

 }
