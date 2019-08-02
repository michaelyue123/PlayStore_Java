import java.util.*;

class Book extends Publication {
	private String[] authors;
	
	public Book(String contentID, String name, int downNum, double price, 
			ArrayList<Comment> comments, String publisher, int numPage, String...authors) {
		super(contentID, name, downNum, price, comments, publisher, numPage);
		this.authors = authors;
	}
	
	public Book(String contentID, String name, int downNum, double price, 
			ArrayList<Comment> comments, String publisher, int numPage) {
		this(contentID, name, downNum, price, new ArrayList<Comment>(), publisher, numPage, "");
	}
	
	public Book(String contentID, String name, double price, 
			ArrayList<Comment> comments, String publisher, int numPage, String...authors) {
		this(contentID, name, 0, price, new ArrayList<Comment>(), publisher, numPage, authors);
	}
	
	public String[] getAuthors() {
		return this.authors;
	}
	
	public void setAuthors(String[] newAuthors) {
		this.authors = newAuthors;
	}
	
	public void addReview(Comment comment) {
		this.getComment().add(comment);
	}
	
	public ArrayList<Comment> showComments() {
		return this.getComment();
	}
	
	public void removeReview(Comment comment) {
		this.getComment().remove(comment);
	}
} 
