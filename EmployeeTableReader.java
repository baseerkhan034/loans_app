package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class EmployeeTableReader {
	    public static void main(String[] args) {
	        String csvFile = "C:\\Users\\User\\Desktop\\Employee.csv";
	        String line = "";

	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
	            while ((line = br.readLine()) != null) {
	                // Split the line by comma to separate the fields
	                String[] employeeData = line.split(",");
	                
	                // Access the employee data fields
	                String firstName = employeeData[0];
	                String middleName = employeeData[1];
	                String lastName = employeeData[2];
	                String gender = employeeData[3];
	                String address = employeeData[4];
	                String contactNumber = employeeData[5];
	                String city = employeeData[6];
	                
	                // Process the employee data and perform desired operations
	                
	                // Example: Print the employee information
	                System.out.println("First Name: " + firstName);
	                System.out.println("Middle Name: " + middleName);
	                System.out.println("Last Name: " + lastName);
	                System.out.println("Gender: " + gender);
	                System.out.println("Address: " + address);
	                System.out.println("Contact Number: " + contactNumber);
	                System.out.println("City: " + city);
	                System.out.println();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
