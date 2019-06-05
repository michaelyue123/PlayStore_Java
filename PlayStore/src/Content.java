import java.util.*;

// create an abstract class Content
abstract class Content {
	// instance variables
	protected String contentID;
	protected String name;
	protected int downNum;
	protected double price;
	protected ArrayList<Comment> comments = new ArrayList<Comment>();
	
	// create a Content constructor with different instantiated variables
	public Content(String contentID, String name, int downNum, double price, ArrayList<Comment> comments) {
		this.contentID = contentID;
		this.name = name;
		this.downNum = downNum;
		this.price = price;
		this.comments = comments; 
	}
	// call default constructor and set the initial value of downNum as 0 and the reviews are empty
	// overloading
	public Content(String contentID, String name, double price, ArrayList<Comment> comments) {
		this(contentID, name, 0, price, comments);
	}
	
	// getters
	public String getID() {
		return contentID;
	}
	
	public String getName() {
		return name;
	}
	// create a method called getPrice
	public double getPrice() {
		return price;
	}
	
	// increases the number of downloads by 1
	public void increaseDownloads() {
		downNum++;
	}
	
	// create a method called addReview
	public void addReview(Comment comment) {
		comments.add(comment);
	}; 
	
	// create an abstract method called showComments
	public abstract ArrayList<Comment> showComments();
	
	// create a method called removeReview
	public void removeReview(Comment comment) {
		comments.remove(comment);
	}
}
