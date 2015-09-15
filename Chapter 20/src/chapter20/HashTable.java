package chapter20;

import java.util.Hashtable;
import java.util.Map;

/**
 * Class CSC3610
 * Programmer: T.J. Stankus
 * Date: 9/15/2015
 * Purpose:
 */
public class HashTable {
    public static void main(String[] args) {
        String[] strClasses = {"Class A", "Class B", "Class C", "Class D", "Class E"};
        String[] sessions = {"Session 1", "Session 2", "Session 3", "Session 4", "Session 5"};
        String[] grades = {"A", "B", "C", "D", "F"};

        Map<String, Object> hashtableDemo = new Hashtable<>();

        hashtableDemo.put("Courses", strClasses);
        hashtableDemo.put("Session", sessions);
        hashtableDemo.put("Grades", grades);

        System.out.println("Courses");
        String[] course = ((String[]) hashtableDemo.get("Courses"));
        for (int i = 0; i < course.length; i++) {
            System.out.println(course[i]);
        }

        System.out.println("\nSessions");
        String[] session = ((String[]) hashtableDemo.get("Session"));
        for (int i = 0; i < course.length; i++) {
            System.out.println(session[i]);
        }

        System.out.println("\nGrades:");
        String[] grade = ((String[]) hashtableDemo.get("Grades"));
        for (int i = 0; i < course.length; i++) {
            System.out.println(grade[i]);
        }

        hashtableDemo.forEach((k, v) -> System.out.println("Key:" + k + "Value" + v));

    }
}
