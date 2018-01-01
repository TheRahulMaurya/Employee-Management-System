package library;

public class Policy
{	
	private int policyId;
	private  String name;
	
	public Policy()
	{}

	public Policy(String name)
	{
		this.name=name;
	}

	public String getName()
	{
		return this.name;
	}

	public int getPolicyId()
	{
		return this.policyId;
	}

	public void setName(String name)
	{
		this.name=name;
	}
}