package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        //1 - Type code to create a list of names. Use ArrayList.
        List myList = new ArrayList();

        myList.add("School");
        myList.add("Teachers");
        myList.add("Pupils");
        myList.add("Inventory");
        myList.add("Local cat");

        //2 - Call print method to print the list passed as its parameter.

//		Object element = myList.get(myList.size());


        //3 - Type code to print this list
        //Notice the order in which elements get printed.
        ListActivity obj = new ListActivity();
        obj.print(myList);

    }

    void print(List myList) {
        Iterator i = myList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

}