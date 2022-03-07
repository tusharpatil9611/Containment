package ContainmentEmployee;
import java.util.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id and name");
		int id=sc.nextInt();
		String name=sc.next();
		Employee e=new Employee(id,name);
		System.out.println("Employee id "+(	e.getId()));
		System.out.println("Employee Name "+e.getName());
		
		

	}

}
