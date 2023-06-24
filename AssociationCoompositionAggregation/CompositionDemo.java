package AssociationCoompositionAggregation;

import java.util.List;
import java.util.ArrayList;

public class CompositionDemo {
	public static void main(String[] args) {
		// creating book object of the book class
		Book b1 = new Book("Effective Java", "Joshua Bloch");
		Book b2 = new Book("Thinking in Java", "Bruce Eckel");
		Book b3 = new Book("Java: The complete reference", "Herbert Schildt");
		
		// creating a list which contains the no of books
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		Library library = new Library(books);
		List<Book> bks = library.getTotalBooksInLibrary();
		
		for(Book bk : bks) {
			System.out.println("Title : " + bk.title + "\nAuthor : " +  bk.author + "\n");
		}
	}
}


// class book
class Book{
	public String title;
	public String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
}


// class library contains list of books
class Library{
	private final List<Book> books;
	
	Library(List<Book> books){
		this.books = books;
	}
	
	public List<Book> getTotalBooksInLibrary(){
		return books;
	}
}


