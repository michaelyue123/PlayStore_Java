import java.util.*;

public class PlayStoreMain {
	public static void showMenu() {
		System.out.println("\nPlease choose following options:");
		System.out.println(" 1. Upgrading a member to premium account");
		System.out.println(" 2. Purchasing one item for one user");
		System.out.println(" 3. Listing all available contents");
		System.out.println(" 4. Showing all purchased items of a user");
		System.out.println(" 5. Showing all comments of a content");
		System.out.println(" 6. Showing all content items of a particular type");
		System.out.println(" 7. Exit");
	}
	
	public static void displayComment(PlayStore store, String contentID) {
		ArrayList<Comment> comments = store.contents.get(contentID).showComments();
		if(comments.size() == 0)
			System.out.println("\nNo comments to show!");
		else
			System.out.println("\nPopular Comments for " + store.contents.get(contentID).getName());
		for(int i=0; i<comments.size(); i++)
			System.out.println(comments.get(i).getUser().getName() + " : " + comments.get(i).getComment());
	}
	
	public static void main(String[] args) {
		
		PlayStore store = new PlayStore();
		String userID, contentID, choice;
		int option;
		
		String[] authors1 = {"L. Tolstoy"};
        Book b1 = new Book ("b1", "War and Peace", 12.55, null, "The Russian Messenger", 1225, authors1);
                
        String[] authors2 = {"F. Scott Fitzgerald"};
        Book b2 = new Book ("b2", "The great gatsby", 10, null, "Charles Scribner's Sons", 180, authors2);
                
        String[] authors3 = {"Thomas H. Cormen", "Charles E. Leiserson", "Ronald L. Rivest", "Clifford Stein"};
        Book b3 = new Book ("b3", "Introduction to algorithms", 100, null, "MIT Press", 1312, authors3);
                
        Magazine m1 = new Magazine("m1", "Forbes", 8.99, "Forbes Media", 50, 201904);
        
        store.addContent(b1);
        store.addContent(b2);
        store.addContent(b3);
        store.addContent(m1);
        
        Application g1 = new Application("g1", "Pokemon", 5.3, "androidV4");    
        Application g2 = new Application("g2", "Pokemon", 5, "iOSV10");
        //a free application
        Application app1 = new Application("app1", "Calendar", 0, "androidV3"); 
        
        store.addContent(g1);
        store.addContent(g2);
        store.addContent(app1);
        
        User u1 = new User("u1", "John Doe", "0412000", 500.0);
        User u2 = new User("u2", "Mary Poppins", "0433191");  
        User u3 = new User("u3", "Dave Smith", "0413456", 1000.0);
        User u4 = new User("u4", "Jackie Chan", "0417654");
        
        store.addUser(u1);
        store.addUser(u2);
        store.addUser(u3);
        store.addUser(u4);
        
        Comment comment1 = new Comment(u1, "This is a fantastic game!");
        g1.addReview(comment1);
                
        Comment comment2 = new Comment(u2, "I never liked this game!");
        g1.addReview(comment2);
                
        Comment comment3 = new Comment(u3, "The game crashes frequently!");
        g1.addReview(comment3);
 
        Comment comment4 = new Comment(u2, "I love Tolstoy!");
        b1.addReview(comment4);
        
        g1.removeReview(comment1);   
        b1.removeReview(comment4);
        
        u1.buyContent(b1);
        u1.buyContent(b3);
        u1.buyContent(m1);
        
        u4.buyContent(g1);
        u4.becomePremium();
        u4.buyContent(m1);
        
        u2.becomePremium();
        u2.buyContent(b1);
        u2.buyContent(g1);
        
        
        Scanner input = new Scanner(System.in);
        
        while(true) {
        	showMenu();
        	System.out.println("Enter your choice");
        	choice = input.nextLine();
        	try {
        		option = Integer.parseInt(choice);
        	}
        	catch(Exception e) {
        		System.out.println("Invalid Input. \nCHoose an option from the Menu below: ");
        		continue;
        	}
        	if(option <= 0 || option > 7) {
        		System.out.println("Invalid Input. \nCHoose an option from the Menu below: ");
        		continue;
        	}
        	else if(option == 7) {
        		System.out.println("GoodBye!");
        		break;
        	}
        	
        	switch(option) {
        		case 1:
        			System.out.println("Please enter the user ID: ");
    				userID = input.nextLine();
    				if(store.users.containsKey(userID))
    					store.users.get(userID).becomePremium();
    				else
    					System.out.println("Invalid User ID");
    				break;
    					     				 			
        		case 2:
        			System.out.println("Please enter the user ID: ");
        			userID = input.nextLine();
        			System.out.println("Please enter the content ID: ");
        			contentID = input.nextLine();
        			
        			if(!store.users.containsKey(userID) || !store.contents.containsKey(contentID))
        				System.out.println("Invalid User or Content ID");
        			else
        				store.users.get(userID).buyContent(store.contents.get(contentID));
        			break;
        			
        		case 3:
        			store.showContent();
        			break;
        			
        		case 4:
        			System.out.println("Please enter the user ID: ");
        			userID = input.nextLine();
        			if(store.users.containsKey(userID))
        				store.users.get(userID).showContentBought();
        			else
        				System.out.println("Invalid User ID");
        			break;
        			
        		case 5:
        			System.out.println("Please enter the content ID: ");
        			contentID = input.nextLine();
        			if(!store.contents.containsKey(contentID))
        				System.out.println("Invalid Content ID");
        			else
        				displayComment(store,contentID);
        			break;
        			
        		case 6:
        			System.out.println("1.Book\n2.Magazine\n3.Application\nChoose a Type");
        			choice = input.nextLine();
        			
        			try {
        				int opt = Integer.parseInt(choice);
        				if(opt == 1) 
        					store.showContent("Book");
        				else if(opt == 2)
        					store.showContent("Magazine");
        				else if(opt == 3)
        					store.showContent("Application");
        				else
        					throw new Exception();
        			}
        			catch(Exception e) {
        				System.out.println("Invalid Input Choice");
        			}
        			
        	}
        }
        input.close();
	}
}
