/*
 * Class: CMSC 203
 * Instructor: Dr. Grinberg
 * Assignment 2
 * Description: This class asks the user for name, address, and 
 * emergency contact information that will be received from the 
 * driver class. 
 * This class also prints out the formatted patient information. 
 * Due: 02/26/2024
 * Platform / Compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my 
 * code to any student.
 * Michael Walsh
 */


public class Patient 
{
	private String firstName, middleName, lastName;
	private String address, city, state, zipCode;
	private String phoneNumber;
	private String emergencyName, emergencyPhone;
	
	// no-arg constructor
	public Patient()
	{
		firstName = "";
		middleName = "";
		lastName = "";
		address = "";
		city = "";
		state = ""; 
		zipCode = "";
		phoneNumber = "";
		emergencyName = "";
		emergencyPhone = "";
	}
	
	// parameterized constructor to initialize patient information 
	public Patient (Patient m)
	{
		firstName = m.firstName;
		middleName = m.middleName;
		lastName = m.lastName;
		address = m.address;
		city = m.city;
		state = m.state;
		zipCode = m.zipCode;
		phoneNumber = m.phoneNumber;
		emergencyName = m.emergencyName;
		emergencyPhone = m.emergencyPhone;
	}
	
	// parameterized constructor to initialize all attributes of patient
	public Patient (String firstName, String middleName, String lastName,
			String address, String city, String state, String zipCode, String phoneNumber,
			String emergencyPhone, String emergencyName)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyName = emergencyName;
		this.emergencyPhone = emergencyPhone;
		
	}
	
	// an accessor and mutator for each attribute of full name
	public String getFirstName()
	{
		return firstName;
		
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
		
	}
	
	public String getMiddleName()
	{
		return middleName;
		
	}
	
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	// method to return full name
	public static String buildName(String firstName, String middleName, String lastName)
	{
		String fullName;
		fullName = firstName + " " + middleName + " " + lastName; 
		return fullName;
	}
	
	// an accessor and mutator for each attribute of full address
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getState()
	{
		return state; 
	}
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String getZipCode()
	{
		return zipCode;
	}
	public void setZipCode(String zipCode)
	{
		this.zipCode = zipCode;
	}
	
	// method to return full address
	public static String buildAddress(String address, String city, String state, String zipCode)
	{
		String fullAddress;
		fullAddress = address + " " + city + " " + state + " " + zipCode;
		return fullAddress;
	}
	
	
	// an accessor and mutator for each attribute of full emergency contact
	public String getEmergencyName()
	{
		return emergencyName;
	}
	public void setEmergencyName(String emergencyName)
	{
		this.emergencyName = emergencyName;
	}
	
	public String getEmergencyPhone()
	{
		return emergencyPhone;
	}
	public void setEmergencyPhone(String emergencyPhone)
	{
		this.emergencyPhone = emergencyPhone;
	}
	
	
	// method to return full emergency info
	public static String buildEmergencyContact(String emergencyName, String emergencyPhone)
	{
		String fullEmergencyInfo;
		fullEmergencyInfo = emergencyName + " " + emergencyPhone;
		return fullEmergencyInfo;
	}
	
	// method to output all of the data that is inputted by User.
	public String toString()
	{
		String full_Name = buildName(firstName, middleName, lastName);
		String full_Address = buildAddress(address, city, state, zipCode);
		String full_EmergencyContact = buildEmergencyContact(emergencyName, emergencyPhone);
		return ("\t" + "Name: " + full_Name + "\n" +
				"\t" + "Address: " + full_Address + "\n" +
				"\t" + "Emergency Contact: " + full_EmergencyContact);
	}
}
