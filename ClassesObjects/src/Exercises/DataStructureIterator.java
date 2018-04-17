package Exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DataStructureIterator {

    public static void main(String[] args) {

        ArrayList numberList = new ArrayList();

        numberList.add(0);
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);


        System.out.println("Original list: ");
        Iterator itr = numberList.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();


        System.out.println("Reversed list: ");
        ListIterator orderedList = numberList.listIterator();

        while(orderedList.hasNext()) {
            Object element = orderedList.next();
            orderedList.set(element);
        }

        while(orderedList.hasPrevious()) {
            Object element = orderedList.previous();
            System.out.print(element + " ");
        }
        System.out.println();

    }

}
