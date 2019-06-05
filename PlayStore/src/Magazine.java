import java.util.*;

//create a class Magazine
class Magazine extends Publication {
	// subclass instance variables
	int volume; 
	
	public Magazine(String contentID, String name, int downNum, double price, ArrayList<Comment> comments,
			String publisher, int numPage, int volume) {
		super(contentID, name, downNum, price, comments, publisher, numPage);
		this.volume = volume;	
	}
	
	// overloading + set up the initial value for Magazine
	public Magazine(String contentID, String name, int downNum, double price, ArrayList<Comment> comments,
			String publisher, int numPage) {
		this(contentID, name, downNum, price, comments, publisher, numPage, 0);
	}
	
	public Magazine(String contentID, String name, double price, String publisher, 
			int numPage, int volume) {
		this(contentID, name, 0, price, new ArrayList<Comment>(), publisher, numPage, volume);
	}
	
	@Override
	public void addReview(Comment comment) {	
		this.comments.add(comment); // add comment to Magazine
	}

	@Override
	public ArrayList<Comment> showComments() {
        return this.comments; // return the list of comments for Magazine		
	}
	
	@Override
	public void removeReview(Comment comment) {
		this.comments.remove(comment); // remove comment from Magazine
	}	
}

