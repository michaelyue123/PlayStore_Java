import java.util.*;

//create a class Publication
class Publication extends Content {
	// subclass instance variables
	protected String publisher;
	protected int numPage;
	
	public Publication(String contentID, String name, int downNum, double price, ArrayList<Comment> comments, 
			String publisher, int numPage) {
		super(contentID, name, downNum, price, comments);
		this.publisher = publisher;
		this.numPage = numPage;	
	}

	@Override
	public void addReview(Comment comment) {
		this.comments.add(comment); // add comment to Publication
	} 

	@Override
	public ArrayList<Comment> showComments() {
		return this.comments; // return the list of comments for Publication
	}	
	@Override
	public void removeReview(Comment comment) {
		this.comments.remove(comment); // remove comment from Publication
	}
}
