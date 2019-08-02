import java.util.*;

class Application extends Content {
	private String osType;
	
	public Application(String contentID, String name, int downNum, double price,
			ArrayList<Comment> comments, String osType) {
		super(contentID, name, downNum, price, comments);
		this.osType = osType;
	}
	
	public Application(String contentID, String name, double price, String osType) {
		this(contentID, name, 0, price, new ArrayList<Comment>(), osType);
	}
	
	public void addReview(Comment c) {
		this.getComment().add(c);
	}
	
	public String getOsType() {
		return osType;
	}
	
	public void setOsType(String newOsType) {
		this.osType = newOsType;
	}
	
	public ArrayList<Comment> showComments() {
		return this.getComment();
	}
	
	public void removeReview(Comment c) {
		this.getComment().remove(c);
	}	
}
