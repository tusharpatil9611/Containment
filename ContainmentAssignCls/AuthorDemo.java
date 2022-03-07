package ContainmentAssignCls;

public class AuthorDemo {

	public static void main(String[] args) {
		Book book=new Book("Wings of Fire ","Kalam Sir");
		book.shoeDetails();
		System.out.println(book.author.getAuithorName());
		System.out.println(book.author.getPlace());
		System.out.println(book.author.getAge());
		System.out.println(book.author.getClass());
		
		
		

	}

}
