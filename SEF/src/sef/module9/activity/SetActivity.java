package sef.module9.activity;

//Needs to be completed

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetActivity {

    public static void main(String[] args) {
        //1 - Type code to create a set of names.
        //Names must be sorted by their natural order.
        //Do research to find if you already have such a class.
        //Also try adding a few duplicate entries to this set.

        Set monthSet = new HashSet();
        monthSet.add("April");
        monthSet.add("February");
        monthSet.add("February");
        monthSet.add("January");
        monthSet.add("March");
        monthSet.add("March");

        //2 - Call print method to print the set passed as its parameter.

        System.out.println(monthSet.add("February"));
        System.out.println(monthSet.add("April"));
        print(monthSet);
    }

    static void print(Set set) {
        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        //3 - Type code to print this set
        //Notice the order in which elements get printed.
    }
}
