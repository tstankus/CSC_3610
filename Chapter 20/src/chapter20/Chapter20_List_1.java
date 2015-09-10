package chapter20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Class CSC2650
 * Programmer: T.J. Stankus
 * Date: 9/3/2015
 * Purpose:
 */
public class Chapter20_List_1 {

    public static void main(String[] args) {
        //create list of one of the concrete classes; ArrayList, LinkedList

        List <Object> studentList = new ArrayList<>();

        String [] studentNames = {"a", "b", "c", "d", "e"};

        //Integer integer = new Integer(256);
        studentList.add(Arrays.asList(studentNames));
        studentList.add(256);
        studentList.add(2, "A");
        System.out.println(studentList.size());
        System.out.println(studentList.contains(studentNames));
        studentList.remove(2);

        studentList.forEach(System.out::println);
        System.out.println(studentList.lastIndexOf(studentList));

        Iterator iterator = studentList.iterator();

        Iterator iterhasnext = Arrays.stream(studentNames).iterator();

       // while (iterhasnext.hasNext()){
         //   System.out.println("\nArray Element " + iterhasnext.next());
        //}

        studentList.forEach(e -> System.out.println("test"));


    }
}
