package ContainmentAssign;

public class college {
		String collegeName;
		String collegeAddress;
		public college(String collegeName, String collegeAddress) {
			super();
			this.collegeName = collegeName;
			this.collegeAddress = collegeAddress;
		}
		public void displayCollege()
		{
			System.out.println("College Name is "+collegeName+"\nCollege Address is "+collegeAddress);
			
		}
		Staff s=new Staff("Rakesh","Punr City");
}
