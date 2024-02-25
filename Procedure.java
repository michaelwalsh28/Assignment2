/*
 * Class: CMSC 203
 * Instructor: Dr. Grinberg
 * Assignment 2
 * Description: This class asks for three different procedures that the
 * patient has undergone and information about those procedures. 
 * The class receives the information from the driver class and 
 * passes back the formatted output. 
 * Due: 02/26/2024
 * Platform / Compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my 
 * code to any student.
 * Michael Walsh
 */


public class Procedure 
{
	private String procedure1, procedure2, procedure3;
	private String date1, date2, date3;
	private String doctor1, doctor2, doctor3;
	private double cost1, cost2, cost3;
	
	double totalCost;
	
	public Procedure()
	{
		procedure1 = "";
		procedure2 = "";
		procedure3 = "";
		date1 = "";
		date2 = "";
		date3 = "";
		doctor1 = "";
		doctor2 = "";
		doctor3 = "";
		cost1 = 0.0;
		cost2 = 0.0;
		cost3 = 0.0;
	}
	
	public Procedure(Procedure m)
	{
		procedure1 = m.procedure1;
		procedure2 = m.procedure2;
		procedure3 = m.procedure3;
		date1 = m.date1;
		date2 = m.date2;
		date3 = m.date3;
		doctor1 = m.doctor1;
		doctor2 = m.doctor2;
		doctor3 = m.doctor3;
		cost1 = m.cost1;
		cost2 = m.cost2;
		cost3 = m.cost3;
	}
	
	public Procedure(String procedure1, String procedure2, String procedure3,
			String date1, String date2, String date3, 
			String doctor1, String doctor2, String doctor3,
			double cost1, double cost2, double cost3)
	{
		this.procedure1 = procedure1;
		this.procedure2 = procedure2;
		this.procedure3 = procedure3;
		this.date1 = date1;
		this.date2 = date2;
		this.date3 = date3;
		this.doctor1 = doctor1;
		this.doctor2 = doctor2;
		this.doctor3 = doctor3;
		this.cost1 = cost1;
		this.cost2 = cost2;
		this.cost3 = cost3;
	}
	
	public String getProcedure1()
	{
		return procedure1;
	}
	public void setProcedure1(String procedure1)
	{
		this.procedure1 = procedure1;
	}
	
	public String getProcedure2()
	{
		return procedure2;
	}
	public void setProcedure2(String procedure2)
	{
		this.procedure2 = procedure2;
	}
	
	public String getProcedure3()
	{
		return procedure3;
	}
	public void setProcedure3(String procedure3)
	{
		this.procedure3 = procedure3;
	}
	
	
	
	public String getDate1()
	{
		return date1;
	}
	public void setDate1(String date1)
	{
		this.date1 = date1;
	}
	public String getDate2()
	{
		return date2;
	}
	public void setDate2(String date2)
	{
		this.date2 = date2;
	}
	public String getDate3()
	{
		return date3;
	}
	public void setDate3(String date3)
	{
		this.date3 = date3;
	}
	
	
	
	public String getDoctor1()
	{
		return doctor1;
	}
	public void setDoctor1(String doctor1)
	{
		this.doctor1 = doctor1;
	}
	public String getDoctor2()
	{
		return doctor2;
	}
	public void setDoctor2(String doctor2)
	{
		this.doctor2 = doctor2;
	}
	public String getDoctor3()
	{
		return doctor3;
	}
	public void setDoctor3(String doctor3)
	{
		this.doctor3 = doctor3;
	}
	
	
	public double getCost1()
	{
		return cost1;
	}
	public void setCost1(double cost1)
	{
		this.cost1 = cost1;
	}
	public double getCost2()
	{
		return cost2;
	}
	public void setCost2(double cost2)
	{
		this.cost2 = cost2;
	}
	public double getCost3()
	{
		return cost3;
	}
	public void setCost3(double cost3)
	{
		this.cost3 = cost3;
	}
	
	
	
	public String toString()
	{
		return ("\n" + "\t\t" + "Procedure: " + this.procedure1 + "\n" +
				"\t\t" + "Procedure Date: " + this.date1 + "\n" +
				"\t\t" + "Practitioner: " + this.doctor1 + "\n" +
				"\t\t" + "Charge: " + this.cost1 + "\n" +
				
				"\n" +
				
				"\t\t" + "Procedure: " + this.procedure2 + "\n" +
				"\t\t" + "Procedure Date: " + this.date2 + "\n" +
				"\t\t" + "Practitioner: " + this.doctor2 + "\n" +
				"\t\t" + "Charge: " + this.cost2 + "\n" +
				
				"\n" +
			
				"\t\t" + "Procedure: " + this.procedure3 + "\n" +
				"\t\t" + "Procedure Date: " + this.date3 +	"\n" +				
				"\t\t" + "Practitioner: " + this.doctor3 + "\n" +
				"\t\t" + "Charge: " + this.cost3 + "\n" +
				
				"\n");
		
	}
}
