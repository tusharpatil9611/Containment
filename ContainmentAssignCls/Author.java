package ContainmentAssignCls;

public class Author {
	String auithorName;
	int age;
	String place;
	public Author(String auithorName, int age, String place) {
		super();
		this.auithorName = auithorName;
		this.age = age;
		this.place = place;
	}
	public String getAuithorName() {
		return auithorName;
	}
	public void setAuithorName(String auithorName) {
		this.auithorName = auithorName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
}
