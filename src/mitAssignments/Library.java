package mitAssignments;

import java.util.ArrayList;
import java.util.List;

public class Library {
	String address;
	List<Book> books = new ArrayList<Book>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));

		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();
		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();
		System.out.println("Borrowing The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();
		System.out.println("Books available in the first Library");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library");

		secondLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();

	}

	public Library(String address) {
		this.address = address;
	}

	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}

	public void printAddress() {
		System.out.println(this.address);
	}

	public void addBook(Book book) {
		this.books.add(book);
	}

	public void borrowBook(String book) {
		for (Book bk : this.books) {
			if (bk.title.equalsIgnoreCase(book)) {
				if (bk.isBorrowed()) {
					System.out.println("Sorry,this book is already borrowed.");
					return;
				} else {
					bk.borrowed();
					System.out
							.println("You successfully borrowed The Lord of the Rings");
					return;
				}
			}

		}
		System.out.println("Sorry, this book is not in our catalog");
	}

	public void printAvailableBooks() {
		int flag = 0;
		for (Book bk : this.books) {
			if ((!(bk.isBorrowed())) && (bk.title != null)) {
				System.out.println(bk.title);
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("No book in catalog");
		}

	}

	public void returnBook(String book) {
		for (Book bk : this.books) {
			if (bk.title.equalsIgnoreCase(book)) {
				bk.returned();
			}
		}

	}
}
