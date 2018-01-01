package entity;

import library.*;

public class Manager implements Person 
{
	private int id;
        ;private long phone;
	private	 String name,email;
	public Address address;
	public Salary salary;
	public Department department;
	

	public Manager(int id,String name,String email,Department department,Address address,int phone,Salary salary)
	{
		try
		{
		this.id=id;
		this.name=name;
		if(Validation.isValidEmail(email))
			this.email=email;
		else
			throw new InvalidEmailException("Invalid Email!!");
		
		if(Validation.isValidPhoneLength(phone))
			this.phone=phone;
		else
			throw new InvalidPhoneException("Invalid Phone number!!");

		this.department=department;
		this.address=address; 
		this.salary=salary;
		}
		catch(InvalidEmailException e)
		{

			System.out.println("Exception : "+e.getMessage());
		}

		catch(InvalidPhoneException e)
		{

			System.out.println("Exception : "+e.getMessage());
		}


	}

	
	public int getId()
	{
		return this.id;
	}

	public long getPhone()
	{
		return phone;
	}

	public void setPhone(int phone) 
	{
		try {
		if(Validation.isValidPhoneLength(phone))
			this.phone=phone;
		else
			throw new InvalidPhoneException("Invalid Phone number!!");
		}
	
		catch(InvalidPhoneException e)
		{

			System.out.println("Exception : "+e.getMessage());
		}

	}
	
	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name=name;
	}
	
	// public String getAddress()
	// {
	// 	return this.address;
	// }

	// public void setAddress(String address)
	// {
	// 	this.address=address;
	// }
	
	// public String getDob()
	// {
	// 	return this.dob;
	// }

	// public void setDob(String dob)
	// {
	// 	this.dob=dob;
	// }
	
	// public String getDoj(String doj)
	// {
	// 	this.doj=doj;
	// }

	// public void setDoj(String doj)
	// {
	// 	this.doj=doj;
	// }
	
	public String getEmail()
	{
		return this.email;
	}

	public void setEmail(String email)
	{
		try
		{
		if(Validation.isValidEmail(email))
			this.email=email;
		else
			throw new InvalidEmailException("Invalid Email!!");
		}
		catch(InvalidEmailException e)
		{

			System.out.println("Exception : "+e.getMessage());
		}

	}

		

	public void displayManagerFullDetails()
	{
		System.out.print("Manager id : "+this.id
			+"\nManager Name : "+this.name
			+"\nManager Email : "+this.email
			+"\nManager  Department : "+this.department.getDepartmentName()
			+"\nManager Address : ");
			this.address.displayAddress();
			System.out.println("\nManager Phone : "+this.phone
			+"\nManager Salary : "+this.salary.getSalary());
	}
	



	// public Boolean isValidId(int id)
	// {

	// }

	// public Boolean isValidMobile(int mobile)
	// {

	// }

	// public Boolean isValidEmail(String email)
	// {

	// }
}