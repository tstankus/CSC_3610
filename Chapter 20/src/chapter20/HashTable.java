package chapter20;

import java.lang.reflect.Array;
import java.util.*;

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

        List<String> classesList = new ArrayList<>();
        List<String> sessionsList = new ArrayList<>();
        List<String> gradesList;
        gradesList = new ArrayList<>(Arrays.asList(grades));

        classesList.addAll(Arrays.asList(strClasses));
        sessionsList.addAll(Arrays.asList(sessions));

        Map<String, List> hashTableList = new Hashtable<>();

        hashTableList.put("Courses", classesList);
        hashTableList.put("Session", sessionsList);
        hashTableList.put("Grades", gradesList);

        hashTableList.forEach((k, v) -> System.out.println(k + " = " + v));
        Map<String, String[]> hashtableDemo = new Hashtable<>();

        hashtableDemo.put("Courses", strClasses);
        hashtableDemo.put("Session", sessions);
        hashtableDemo.put("Grades", grades);

       // for(Map.Entry<> entry: hashtableDemo.entrySet());

       /* System.out.println("Courses");
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
        }*/

       // hashtableDemo.forEach((k, v) -> System.out.println(k + " = " + Arrays.asList(v)));



    }
}
