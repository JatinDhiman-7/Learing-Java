package challenge;

public class LibraryItem {
	protected String itemID;
	protected String title;
	protected String author;
	

	public LibraryItem(String itemID, String title, String author) {
		this.itemID = itemID;
		this.title = title;
		this.author = author;
	}
	
	protected void checkout() {
		System.out.println("Checkout");
		
	}
	
	protected void returnItem() {
		System.out.println("Returning the item");
		
	}

	public static void main(String[] args) {
		
	}

}
