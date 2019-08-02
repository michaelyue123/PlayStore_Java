import java.util.*;

public class PlayStore {
	HashMap<String, Content> contents;
	HashMap<String, User> users;
	
	public PlayStore() {
		this.contents = new HashMap<String, Content>();
		this.users = new HashMap<String, User>();
	}
	
	public void addContent(Content content) {
		this.contents.put(content.getContentID(), content);
	}
	
	public void addUser(User user) {
		this.users.put(user.getUserID(), user);
	}
	
	public void showContent() {
		System.out.println("\nContents of Store\n");
		for(String i : contents.keySet()) {
			System.out.println("ContentID: " + i + " name: " + contents.get(i).getName() + 
					" price: $" + contents.get(i).getPrice());
		}
	}
	
	public void showContent(String className) {
		System.out.println(className + " Type Contents of Store\n");
		for(String i : contents.keySet()) {
			if(contents.get(i).getClass().getName().equals(className))
				System.out.println("ContentID: " + i + " name: " + contents.get(i).getName() +
						" price: $" + contents.get(i).getPrice());
		}
	}
}
