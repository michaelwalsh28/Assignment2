/*
 * Class: CMSC 203
 * Instructor: Dr. Grinberg
 * Assignment 2
 * Description: This class is the driver class that calls the patient 
 * and procedure classes to run the program. The information is passed
 * to those classes specifically to format the output using methods. 
 * Due: 02/26/2024
 * Platform / Compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my 
 * code to any student.
 * Michael Walsh
 */


import java.text.NumberFormat;
import java.util.Scanner;

public class PatientDriver 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String first_Name, middle_Name, last_Name;
		String address_1, city_1, state_1, zip_Code;
		String emergency_Name, emergency_Phone;
		
		String firstProcedure, secondProcedure, thirdProcedure;
		String date_1, date_2, date_3;
		String doctor_1, doctor_2, doctor_3;
		double cost_1, cost_2, cost_3;
		
		double totalCost;
				
		// Create Scanner Object
		Scanner keyboard = new Scanner(System.in);
		
		// Call Patient Class
		Patient myPatient = new Patient();
				
		// Get User Input for Patient information
		System.out.print("Enter your first name: ");
		first_Name = keyboard.nextLine();
		myPatient.setFirstName(first_Name);
				
		System.out.print("Enter your middle name: ");
		middle_Name = keyboard.nextLine();
		myPatient.setMiddleName(middle_Name);
				
		System.out.print("Enter your last name: ");
		last_Name = keyboard.nextLine();
		myPatient.setLastName(last_Name);
		
		System.out.println("Full Address: ");
		System.out.print("Address: ");
		address_1 = keyboard.nextLine();
		myPatient.setAddress(address_1);
		
		System.out.print("City: ");
		city_1 = keyboard.nextLine();
		myPatient.setCity(city_1);
		
		System.out.print("State: ");
		state_1 = keyboard.nextLine();
		myPatient.setState(state_1);
		
		System.out.print("Zip Code: ");
		zip_Code = keyboard.nextLine();
		myPatient.setZipCode(zip_Code);
		
		System.out.print("Emergency Contact Full Name: ");
		emergency_Name = keyboard.nextLine();
		myPatient.setEmergencyName(emergency_Name);
		
		System.out.print("Emergency contact phone number: ");
		emergency_Phone = keyboard.nextLine();
		myPatient.setEmergencyPhone(emergency_Phone);
		
		
		// Calling the procedure class
		Procedure myProcedure = new Procedure();
		
		//Iteration 1 of procedure class
		
		System.out.print("Enter the type of the first procedure: ");
		firstProcedure = keyboard.nextLine();
		myProcedure.setProcedure1(firstProcedure);
		
		System.out.print("Enter the date of first procedure: ");
		date_1 = keyboard.nextLine();
		myProcedure.setDate1(date_1);
		
		System.out.print("Enter the doctor for first procedure: ");
		doctor_1 = keyboard.nextLine();
		myProcedure.setDoctor1(doctor_1);
		
		System.out.print("Enter the cost of the first procedure: ");
		cost_1 = keyboard.nextDouble();
		// Input Validation
		while (cost_1 <= 0)
		{
			System.out.println("Invalid input. Enter a cost greater than Zero: ");
			cost_1 = keyboard.nextDouble();
		}
		keyboard.nextLine();
		myProcedure.setCost1(cost_1);
		
		
		
		// Iteration 2 of procedure class
		
		System.out.print("Enter the type of the second procedure: ");
		secondProcedure = keyboard.nextLine();
		myProcedure.setProcedure2(secondProcedure);
		
		
		System.out.print("Enter the date of second procedure: ");
		date_2 = keyboard.nextLine();
		myProcedure.setDate2(date_2);
		
		
		System.out.print("Enter the doctor for second procedure: ");
		doctor_2 = keyboard.nextLine();
		myProcedure.setDoctor2(doctor_2);
		
		
		System.out.print("Enter the cost of the second procedure: ");
		cost_2 = keyboard.nextDouble();
		// Input Validation
		while (cost_2 <= 0)
		{
			System.out.println("Invalid input. Enter a cost greater than Zero: ");
			cost_2 = keyboard.nextDouble();
		}
		keyboard.nextLine();
		myProcedure.setCost2(cost_2);
		
		
		// Iteration 3 of procedure class
		
		System.out.print("Enter the type of the third procedure: ");
		thirdProcedure = keyboard.nextLine();
		myProcedure.setProcedure3(thirdProcedure);

		
		System.out.print("Enter the date of third procedure: ");
		date_3 = keyboard.nextLine();
		myProcedure.setDate3(date_3);
		
		
		System.out.print("Enter the doctor for third procedure: ");
		doctor_3 = keyboard.nextLine();
		myProcedure.setDoctor3(doctor_3);
		
		
		System.out.print("Enter the cost of the third procedure: ");
		cost_3 = keyboard.nextDouble();
		// Input Validation
		while (cost_3 <= 0)
		{
			System.out.println("Invalid input. Enter a cost greater than Zero: ");
			cost_3 = keyboard.nextDouble();
		}
		keyboard.nextLine();
		myProcedure.setCost3(cost_3);
		
		
		
		totalCost = (cost_1 + cost_2 + cost_3); 
		String.format("%.2f", totalCost);
		
		// To print out all of the formated output. 
		
		System.out.println();
		System.out.println("Patient Info: ");
		System.out.print(myPatient.toString());
		System.out.println();
		System.out.print(myProcedure.toString());
		
		String formatter = NumberFormat.getInstance().format(totalCost);
		System.out.printf("Total Charges: $" + formatter);
		System.out.println();
		System.out.println();
		System.out.println("Student Name: Michael Walsh");
		System.out.println("MC#: M21148548");
		System.out.println("Due Date: 02/26/2024");
		
	}

}
