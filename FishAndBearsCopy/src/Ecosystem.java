//Kaylee Dalton - Kerby 2235 - 10/9/2022
//Using linked lists makes my program not lag anymore!



import java.util.*;
import java.util.Random;
import java.util.Scanner;



class Animal
{
}

class Fish extends Animal
{
    //I don't know if I need anything in here so I left em blank.
}

class Bear extends Animal
{
}

class Ecosystem
{
    public static final double movePercent = 1; //they only move 90% of the time (This was mostly to help my computer not die)

    public static int    defaultFish  = 0;
    private int fishyCount = 0;

    public static int    defaultBears = 0;
    private int bearCount = 0

            ;

    public static final int    length          = 320000;




    //Create doubly linked list
    public LinkedList<Animal> River2 = new LinkedList<Animal>();
    public DoublyLinkedList_Original River3 = new DoublyLinkedList_Original<>();
    private Random random = new Random();

    //River2.get(x)
    public class DoublyLinkedList_Original<E> {

        //---------------- nested Node class ----------------
        /**
         * Node of a doubly linked list, which stores a reference to its
         * element and to both the previous and next node in the list.
         */
        private static class Node<E> {

            /** The element stored at this node */
            private E element;               // reference to the element stored at this node

            /** A reference to the preceding node in the list */
            private Node<E> prev;            // reference to the previous node in the list

            /** A reference to the subsequent node in the list */
            private Node<E> next;            // reference to the subsequent node in the list

            /**
             * Creates a node with the given element and next node.
             *
             * @param e  the element to be stored
             * @param p  reference to a node that should precede the new node
             * @param n  reference to a node that should follow the new node
             */
            public Node(E e, Node<E> p, Node<E> n) {
                element = e;
                prev = p;
                next = n;
            }

            // public accessor methods
            /**
             * Returns the element stored at the node.
             * @return the element stored at the node
             */
            public E getElement() { return element; }

            /**
             * Returns the node that precedes this one (or null if no such node).
             * @return the preceding node
             */
            public Node<E> getPrev() { return prev; }

            /**
             * Returns the node that follows this one (or null if no such node).
             * @return the following node
             */
            public Node<E> getNext() { return next; }

            // Update methods
            /**
             * Sets the node's previous reference to point to Node n.
             * @param p    the node that should precede this one
             */
            public void setPrev(Node<E> p) { prev = p; }

            /**
             * Sets the node's next reference to point to Node n.
             * @param n    the node that should follow this one
             */
            public void setNext(Node<E> n) { next = n; }
        } //----------- end of nested Node class -----------

        // instance variables of the DoublyLinkedList
        /** Sentinel node at the beginning of the list */
        private Node<E> header;                    // header sentinel

        /** Sentinel node at the end of the list */
        private Node<E> trailer;                   // trailer sentinel

        /** Number of elements in the list (not including sentinels) */
        private int size = 0;                      // number of elements in the list

        /** Constructs a new empty list. */
        public DoublyLinkedList_Original() {
            header = new Node<>(null, null, null);      // create header
            trailer = new Node<>(null, header, null);   // trailer is preceded by header
            header.setNext(trailer);                    // header is followed by trailer
        }

        // public accessor methods
        /**
         * Returns the number of elements in the linked list.
         * @return number of elements in the linked list
         */
        public int size() { return size; }

        /**
         * Tests whether the linked list is empty.
         * @return true if the linked list is empty, false otherwise
         */
        public boolean isEmpty() { return size == 0; }

        /**
         * Returns (but does not remove) the first element of the list.
         * @return element at the front of the list (or null if empty)
         */
        public E first() {
            if (isEmpty()) return null;
            return header.getNext().getElement();   // first element is beyond header
        }

        /**
         * Returns (but does not remove) the last element of the list.
         * @return element at the end of the list (or null if empty)
         */
        public E last() {
            if (isEmpty()) return null;
            return trailer.getPrev().getElement();    // last element is before trailer
        }

        // public update methods
        /**
         * Adds an element to the front of the list.
         * @param e   the new element to add
         */
        public void addFirst(E e) {
            addBetween(e, header, header.getNext());    // place just after the header
        }

        /**
         * Adds an element to the end of the list.
         * @param e   the new element to add
         */
        public void addLast(E e) {
            addBetween(e, trailer.getPrev(), trailer);  // place just before the trailer
        }

        /**
         * Removes and returns the first element of the list.
         * @return the removed element (or null if empty)
         */
        public E removeFirst() {
            if (isEmpty()) return null;                  // nothing to remove
            return remove(header.getNext());             // first element is beyond header
        }

        /**
         * Removes and returns the last element of the list.
         * @return the removed element (or null if empty)
         */
        public E removeLast() {
            if (isEmpty()) return null;                  // nothing to remove
            return remove(trailer.getPrev());            // last element is before trailer
        }

        // private update methods
        /**
         * Adds an element to the linked list in between the given nodes.
         * The given predecessor and successor should be neighboring each
         * other prior to the call.
         *
         * @param predecessor   node just before the location where the new element is inserted
         * @param successor     node just after the location where the new element is inserted
         */
        private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
            // create and link a new node
            Node<E> newest = new Node<>(e, predecessor, successor);
            predecessor.setNext(newest);
            successor.setPrev(newest);
            size++;
        }
        public Animal iterate (int n){
            Animal index = null;

            index = (River2.get(n));

            return index;
        }

        /**
         * Removes the given node from the list and returns its element.
         * @param node    the node to be removed (must not be a sentinel)
         */
        private E remove(Node<E> node) {
            Node<E> predecessor = node.getPrev();
            Node<E> successor = node.getNext();
            predecessor.setNext(successor);
            successor.setPrev(predecessor);
            size--;
            return node.getElement();
        }

        /**
         * Produces a string representation of the contents of the list.
         * This exists for debugging purposes only.
         */
        public String toString() {
            StringBuilder sb = new StringBuilder("(");
            Node<E> walk = header.getNext();
            while (walk != trailer) {
                sb.append(walk.getElement());
                walk = walk.getNext();
                if (walk != trailer)
                    sb.append(", ");
            }
            sb.append(")");
            return sb.toString();
        }
        ///NEW METHOD
        public Animal geter(LinkedList<Animal> River2, int x){
            return River2.get(x);

        }
    } //----------- end of DoublyLinkedList class ----
    public Ecosystem()
    {

        for (int i = 0; i <= length; i++){
            River2.add(null);
        }
        int min = 20000;
        int max = 300000;
        ///Randomized the starting populations of animals.
        //defaultBears = random.nextInt(max - min +min);
        defaultBears = max;
        defaultFish = min;

//Create the starting locations. The animals are born into the world.
        while (bearCount < defaultBears)
        {bearCount += theMiracleOfLife (new Bear() );}

        while (fishyCount < defaultFish)
        {fishyCount += theMiracleOfLife (new Fish() );}




    }


    int theMiracleOfLife(Animal animal)//baby bears and fishies <3
    {

        int newborns = 0;
        int occupied = fishyCount + bearCount;
        boolean chekit = true;
        if (occupied < (length))
        {
            while (chekit)
            {
                int x = random.nextInt (length);


                if (River2.get(x) == null)
                {
                    River2.add(x, animal);
                    chekit=false;
                    newborns++;
                }
            }
        }

        return newborns;
    }


    public String toString()
    {
        String outStr = "Number of Fish " + fishyCount + "\nNumber of Bears " + bearCount + "\nNumber of null " + (length-(bearCount+fishyCount));

        return outStr;
    }



    public void printIt()
    {
        System.out.println(this);pain();


    }
    public void pain () ///named for the pain it caused me
    {
        for (int x = 0; x < length; x++)
        {
            River3.geter(River2, x);
            if (River3.geter(River2, x) != null)
            {
                double chance = random.nextDouble();

                if (chance < movePercent)//I had this < backwards > for a while and it made my program run FOREVER
                {

                    boolean xCanMove = false;

                    int xChange = random.nextInt (3) - 1;

                    int xNew = x + xChange;

                    if ((xChange != 0) && (xNew >= 0) && (xNew < length) )
                    {
                        xCanMove = true;
                    }

                    if ((xCanMove == true))
                    {
                        int xFinal = x;


                        if (xCanMove == true)
                            xFinal = xNew;



                        if (River3.geter(River2, xFinal) == null)
                        {
                            River2.add(xFinal, River2.get(x));
                            River2.add(x,null);
                        }
                        else if (River2.get(x).getClass() == River2.get(xFinal).getClass() )
                        {
                            try {
                                if (River3.geter(River2, x).getClass().getName().equals("Fish") == true)
                                    fishyCount += theMiracleOfLife(new Fish());
                            } finally {

                            }

                            if ((River3.geter(River2, x) != null) && (River3.geter(River2, x).getClass().getName().equals ("Bear") == true))
                                bearCount += theMiracleOfLife (new Bear() );
                        }
                        else if (River3.geter(River2, x).getClass() != River3.geter(River2, xFinal).getClass() )
                        {

                            if (River3.geter(River2, x).getClass().getName().equals ("Fish") == true)
                            {
                                if (fishyCount > 0)
                                {
                                    River2.add(x,null);
                                    fishyCount--;
                                }
                            }

                            if (River3.geter(River2, xFinal).getClass().getName().equals ("Fish") == true)
                            {
                                if (fishyCount > 0)
                                {
                                    River2.add(xFinal,River2.get(x));
                                    fishyCount--;
                                }
                            }
                        }




                    }

                }
            }

        }

    }

    public static void main (String[] args)
    {
        long start = System.nanoTime();
        Ecosystem riv = new Ecosystem ();
        int moveNumber = 1;


        System.out.println("There has been " + moveNumber + " move.");
        while (riv.fishyCount > 0)
        //stops when hits NO FISH
        {

            System.out.println("There have been " + moveNumber + " moves");
            riv.printIt();
            moveNumber++;
        }
        System.out.println("There are no more fish!");
        long end = System.nanoTime();
        long exec = end - start;
        System.out.println("Nanoseconds: " + exec);




    }


}