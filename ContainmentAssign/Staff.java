package ContainmentAssign;

public class Staff {
	String employeeName;
	String staffAddress;
	public Staff(String employeeName, String staffAddress) {
		super();
		this.employeeName = employeeName;
		this.staffAddress = staffAddress;
	}
	public void staffDisplay()
	{
		System.out.println("Employee Name is "+employeeName+"\nAddress of the Staff  "+staffAddress);
	}
	 person1 p= new person1("Tushar",342421668,"HefShine","Prismatik Design Solution","Karve Nagar Pune");

}
