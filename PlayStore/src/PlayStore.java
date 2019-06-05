import java.util.*;

public class PlayStore {
	// instance variables with default modifiers
	
	HashMap<String, Content> contents;
	HashMap<String, User> users;
	
    public PlayStore() {
    	// default constructor
		this.contents = new HashMap<String, Content>();;
		this.users = new HashMap<String, User>();
	}

    public void addContent(Content content) {
    	// add new content to content list
    	this.contents.put(content.contentID, content);
    }
    
       
    public void addUser(User user) {
    	// add new user to user list
    	this.users.put(user.userID, user);
    }
        
	public void showContent() {
		// show a list of all available contents
		
		System.out.println("\nContents of Store\n");
		for (String i : contents.keySet()) {
			System.out.println("ID: " + i + " name: " + contents.get(i).name + " price: $" + contents.get(i).price);
		} 	
	}
	
	public void showContent(String className) {   	
		// show list of contents of a particular type such as application, 
		// book or magazine
		// className specifies the type
			
		System.out.println(className + " Type Contents of Store\n");
		for (String i : contents.keySet()) {
		    if(contents.get(i).getClass().getName().equals(className))	// check for type
		    	System.out.println("ID: " + i + " name: " + contents.get(i).name + " price: $" + contents.get(i).price);
		} 
	}
}

