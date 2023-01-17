import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.ArrayList;

public class StackQueue {
    public static void main (String[] args) {
        long start = System.nanoTime();
        ArrayDeque<Integer> AD = new ArrayDeque<>();
        LinkedList<Integer> LL = new LinkedList<>();
        ArrayList<Integer> AL = new ArrayList<>();

        AD.addFirst(1);
        AD.addFirst(2);
        AD.addFirst(3);
        AD.addFirst(4);
        AD.addFirst(5);
        System.out.println(AD);
        AD.addFirst(1);
        AD.addLast(5);
        System.out.println(AD);
        AD.removeLast();
        //AD.removeFirst();
        System.out.println(AD);
        AD.removeLastOccurrence(4);
        System.out.println(AD);

        System.out.println("Linked List below");
        // Ctrl + R to bring up search and replace
        // Ctrl + F for just search
        // https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/LinkedList.html
        LL.addFirst(1);
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addFirst(4);
        LL.addFirst(5);
        System.out.println(LL);
        LL.addFirst(1);
        LL.addLast(5);
        System.out.println(LL);
        LL.removeLast();
        //LL.removeFirst();
        System.out.println(AL);
        LL.removeLastOccurrence(4);
        System.out.println(LL);

/*        AL.add(0,100000);
        AL.add(0,200000);
        AL.add(0,400000);
        AL.add(0,800000);*/
        AL.add(1000000);
        AL.add(2000000);
        AL.add(4000000);
        AL.add(8000000);


        System.out.println(AL);
        long end = System.nanoTime();
        long exec = end - start;
        System.out.println("Nanoseconds " + exec);


    }
}
