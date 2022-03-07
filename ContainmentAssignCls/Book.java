package ContainmentAssignCls;

public class Book {
	String name;
	
	public Book(String name, String author) {
		super();
		this.name = name;
		
	}
	
	
	public void shoeDetails()
	{
		System.out.println(" Book name is -"+name+"\nAutor Name "+author);
	}
	Author author=new Author("A P J Abdul Kalam ",62,"India");
}

