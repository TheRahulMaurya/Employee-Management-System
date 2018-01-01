package library;

public class Project
{
	int projectId;
	String projectName;
	
	public Project()
	{

	}

	public Project(int projectId,String projectName)
	{
		this.projectId=projectId;
		this.projectName=projectName;
	}

	public int getProjectId()
	{
		return this.projectId;
	}

	public String getProjectName()
	{
		return this.projectName;
	}	

	public void setProjectName(String projectName)
	{
		this.projectName=projectName;
	}

	
}
	
