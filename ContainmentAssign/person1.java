package ContainmentAssign;

public class person1 {
	String name;
	long adharNo;
	String currentJobName;
	String oldJob;
	String jobLocation;
	
	
	public person1(String name, long adharNo, String currentJobName,
			String oldJob, String jobLocation) {
		super();
		this.name = name;
		this.adharNo = adharNo;
		this.currentJobName = currentJobName;
		this.oldJob = oldJob;
		this.jobLocation = jobLocation;
	}


	public void display()
	{
		System.out.println("Person Name is "+name+"\n Person Adhar No "+adharNo+
				"\nCurrent Job Name "+currentJobName+"\nPerson old Job "+oldJob+"\nPerson Job Location "+jobLocation);
	}
	Address1 add= new Address1(422207,"Nashik","Maharashtra","India");
	
}
