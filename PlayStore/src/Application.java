import java.util.*;

// create a class Application
class Application extends Content {
	// instance variable
	protected String osType;
	
	public Application(String contentID, String name, int downNum, double price,
			ArrayList<Comment> comments, String osType) {
		super(contentID, name, downNum, price, comments);
		this.osType = osType;		
	}

	public Application(String contentID, String name, double price,	String osType) {
		this(contentID, name, 0, price, new ArrayList<Comment>(),osType);
	}
	// overloading + set up the initial value for Application 
	public Application(String contentID, String name, String osType) {
		this(contentID, name, 0, 0, new ArrayList<Comment>(), osType);
	}

	@Override
	public void addReview(Comment comment) {	
		this.comments.add(comment); // add comment to Application
	}

	@Override
	public ArrayList<Comment> showComments() {
        return this.comments; // return the list of comments for Application		
	}
	
	@Override
	public void removeReview(Comment comment) {
		this.comments.remove(comment); // remove comment from Application
	}
}
