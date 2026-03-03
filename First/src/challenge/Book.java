package challenge;

public class Book extends LibraryItem {
	private String ISBN;

	public Book(String itemID, String title, String author, String iSBN) {
		super(itemID, title, author);
		ISBN = iSBN;
	}
	
}
