package homework_hashtable_demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Class CSC3610
 * Programmer: T.J. Stankus
 * Date: 9/22/2015
 * Purpose:
 */
public class MainHashtableHomework {

    public static void main(String[] args) throws IOException{

        Hashtable<String, StaffInformation> names = new Hashtable<String, StaffInformation>();

        String data = "";

        Scanner inputData = new Scanner(System.in);

        while (true){

            StaffInformation staffInformation = new StaffInformation();


            System.out.println("Enter first name of staff: ");
            data = inputData.nextLine();
            staffInformation.setFirstName(data);
            staffInformation.getFirstName();

            if (data.equals("exit")){
                break;
            }

            System.out.println("Enter last name of staff: ");
            data = inputData.nextLine();
            staffInformation.setLastName(data);
            staffInformation.getLastName();


            if (data.equals("exit")){
                break;
        }
            System.out.println("Enter office number of staff: ");
            data = inputData.nextLine();
            staffInformation.setOfficeNumber(data);
            staffInformation.getOfficeNumber();

            names.put("Aurora Staff", staffInformation);
            System.out.println("\n Staff data added hashtable: \n");
    }



        FileOutputStream fos = new FileOutputStream("test.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(names);
        oos.close();



}}
