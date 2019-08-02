
class Comment {
	private User user;
	private String comment;
	
	public Comment(User user, String comment) {
		this.user = user;
		this.comment = comment;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public void setUser(User newUser) {
		this.user = newUser;
	}
	
	public String getComment() {
		return this.comment;
	}
	
	public void setComment(String newComment) {
		this.comment = newComment;
	}
}
