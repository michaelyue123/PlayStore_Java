import java.util.*;

class Publication extends Content {
	private String publisher;
	private int numPage;
	
	public Publication(String contentID, String name, int downNum, double price, 
			ArrayList<Comment> comments, String publisher, int numPage) {
		super(contentID, name, downNum, price, comments);
		this.publisher = publisher;
		this.numPage = numPage;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String newPublisher) {
		this.publisher = newPublisher;
	}
	
	public int getnumPage() {
		return numPage;
	}
	
	public void setNumPage(int newNumPage) {
		this.numPage = newNumPage;
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
