import java.util.*;

abstract public class Content {
	private String contentID;
	private String name;
	private int downNum;
	private double price;
	private ArrayList<Comment> comments = new ArrayList<Comment>();
	
	
	public Content(String contentID, String name, int downNum, double price, ArrayList<Comment> comments) {
		this.contentID = contentID;
		this.name = name;
		this.downNum = downNum;
		this.price = price;
		this.comments = comments;
	}
	
	public Content(String contentID, String name, double price, ArrayList<Comment> comments) {
		this(contentID, name, 0, price, comments);
	}
	
	// getter
	public String getContentID() {
		return contentID;
	}
	// setter
	public void setCotentID (String newContentID) {
		this.contentID = newContentID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String newName) {
		this.name = newName;
	}
	
	public int getDownNum() {
		return downNum;
	}
	
	public void setDownNum(int downN) {
		this.downNum = downN;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice (double newPrice) {
		this.price = newPrice;
	}
	
	public ArrayList<Comment> getComment() {
		return comments;
	}
	
	public void setComment(ArrayList<Comment> newComment) {
		this.comments = newComment;
	}
	
	public void increaseDownloads() {
		downNum++;
	}
	
	public void addReview(Comment c) {
		comments.add(c);
	}
	
	public abstract ArrayList<Comment> showComments();
	
	public void removeReview(Comment c) {
		comments.remove(c);
	}	
}
