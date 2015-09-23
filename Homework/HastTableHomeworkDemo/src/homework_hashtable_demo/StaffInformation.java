package homework_hashtable_demo;

import java.io.Serializable;

/**
 * Class CSC3610
 * Programmer: T.J. Stankus
 * Date: 9/22/2015
 * Purpose:
 */
public class StaffInformation implements Serializable {

    private String firstName;
    private String lastName;
    private String officeNumber;

    public StaffInformation() {
    }

    public StaffInformation(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return "StaffInformation{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", officeNumber='" + officeNumber + '\'' +
                '}';
    }
}
