package library;

public class Department
{
	int departmentId;
	String departmentName;
	
	public Department()
	{

	}

	public Department(int departmentId,String departmentName)
	{
		this.departmentId=departmentId;
		this.departmentName=departmentName;
	}

	public int getDepartmentId()
	{
		return this.departmentId;
	}

	public String getDepartmentName()
	{
		return this.departmentName;
	}	

	public void setDepartmentName(String departmentName)
	{
		this.departmentName=departmentName;
	}

	
}
	
