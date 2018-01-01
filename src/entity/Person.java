package entity;



interface Person
{
	int id=0;
        long phone=0;
	String name=null;
	String email=null;

	


	public int getId();
	

	public long getPhone();
	
	public void setPhone(int phone) throws Exception;
	
	
	public String getName();
	

	public void setName(String name);
	

	// public String getDob();
	

	// public void setDob(String dob);
	
	
	// public String getDoj(String doj);
	

	// public void setDoj(String doj);
	
	
	public String getEmail();
	

	public void setEmail(String email) throws Exception;
	

	
}