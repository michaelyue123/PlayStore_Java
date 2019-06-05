import java.util.*;

//create a class Book
class Book extends Publication {
	// subclass instance variables with default modifiers
	String[] authors;
	
	public Book(String contentID, String name, int downNum, double price, ArrayList<Comment> comments, String publisher,
			int numPage, String... authors) {
		super(contentID, name, downNum, price, comments, publisher, numPage);
		this.authors = authors;
	}
	
	// overloading + set up the initial value for Book
	public Book(String contentID, String name, int downNum, double price, ArrayList<Comment> comments, String publisher,
			int numPage) {
		this(contentID, name, 0, price, new ArrayList<Comment>(), publisher, numPage, "");
	}
	
	public Book(String contentID, String name, double price, String publisher,
			int numPage,String... authors) {
		this(contentID, name, 0, price, new ArrayList<Comment>(), publisher, numPage, authors);
	}
	@Override
	public void addReview(Comment comment) {	
		this.comments.add(comment); // add comment to Book
	}

	@Override
	public ArrayList<Comment> showComments() {
        return this.comments; // return the list of comments for Book		
	}
	
	@Override
	public void removeReview(Comment comment) {
		this.comments.remove(comment); // remove comment from Book
	}
}