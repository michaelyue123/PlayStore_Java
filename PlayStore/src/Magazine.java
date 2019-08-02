import java.util.*;

class Magazine extends Publication {
	private int volume;
	
	public Magazine(String contentID, String name, int downNum, double price, ArrayList<Comment> comments,
			String publisher, int numPage, int volume) {
		super(contentID, name, downNum, price, comments, publisher, numPage);
		this.setVolume(volume);
	}
	
	public Magazine(String contentID, String name, int downNum, double price, ArrayList<Comment> comments,
			String publisher, int numPage) {
		this(contentID, name, downNum, price, comments, publisher, numPage, 0);
	}
	
	public Magazine(String contentID, String name, double price, String publisher, int numPage, int volume) {
		this(contentID, name, 0, price, new ArrayList<Comment>(), publisher, numPage, volume);
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

	public int getVolume() {
		return volume;
	}

	public void setVolume(int newVolume) {
		this.volume = newVolume;
	}
	
}
