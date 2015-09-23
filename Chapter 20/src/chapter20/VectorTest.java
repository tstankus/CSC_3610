package chapter20;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * Class CSC3610
 * Programmer: T.J. Stankus
 * Date: 9/15/2015
 * Purpose:
 */
public class VectorTest {
    public static void main(String[] args) {

        List<Object> courses = new Vector<>();

        String[] studentNames = {"A", "B", "C", "D", "E"};
        courses.addAll(Arrays.asList(studentNames));

        courses.forEach(System.out::println);
        courses.forEach(e-> System.out.println());


        for (int i = 0; i < courses.size(); i++) {
            System.out.println((courses.get(i)));

        }
    }
}
