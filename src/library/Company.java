package library;

public class Company
{
	private String name,address;
	private int companyId;
	private Policy policy;

	public Company(int companyId,String name,String address)
	{
		this.name=name;
		this.companyId=companyId;
		this.address=address;
		policy=new Policy();
	}

	public int getId()
	{
		return this.companyId;
	}

	public String getName()
	{
		return this.name;
	}

	public String getAddress()
	{
		return this.address;
	}

	public void setName(String name)
	{
		this.name=name;

	}

	public void setId(int companyId)
	{
		this.companyId =companyId;

	}

	public void setAddress(String address)
	{
		this.address=address;
	}

	// public static void main(String args[])
	// {
	// 	Company company=new Company(123,"ABC","Delhi");
	// 	System.out.println("Company "+company.getName()+" has pocily "+company.policy.getName());
	// }
}