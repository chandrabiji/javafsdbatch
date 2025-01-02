package oops;

class Author{
	String name;
	Author(String name){
		this.name = name;
	}
	public String toString() {
		return name;
	}
}
public class Book {
	
	String title;
	Author author;//Association with a Author class
	
	public Book(String title, Author author) {
		super();
		this.title = title;
		this.author = author;
	}

    public void display() {
    	System.out.println("Book  : "+title+", Author  : "+author);
    }

	public static void main(String[] args) {
		Author author = new Author("George Orwell");
		Book book=new Book("1984",author);
		book.display();
		

	}

}
