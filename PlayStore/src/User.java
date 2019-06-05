import java.text.DecimalFormat;
import java.util.*;

// create a class User
class User {
	// instance variables with default modifiers
	String userID;
	String name;
	String phoneNum;
	double balance;
	boolean premUser;
	ArrayList<Content> contentsBought;
	
	// create User constructor 
	public User(String userID, String name, String phoneNum, double balance, boolean premUser) {
		this.userID = userID;
		this.name = name;
		this.phoneNum = phoneNum;
		this.balance = balance;
		this.premUser = premUser;
		contentsBought = new ArrayList<Content>();
	}
	
	// overloading + set up the initial value for User
	public User(String userID, String name, String phoneNum, boolean premUser) {
		this(userID, name, phoneNum, 0.0, premUser);
	}
	
	public User(String userID, String name, String phoneNum, int bal) {
		this(userID, name, phoneNum, bal, false);
	}
	
	public User(String userID, String name, String phoneNum) {
		this(userID, name, phoneNum, 500.0, false);
	}
	
	// create a method called becomePremium
	public boolean becomePremium() {
		if(premUser)
		{
			System.out.println("Already a premium user");
			return false;
		}
		if (balance >= 100) {
			balance = balance - 100;
			premUser = true; // make premium user
			System.out.println("Congratulations! " + name +"  is now a premium user!");
			return true;
		} 
		else {
			System.out.println("Insufficient balance, please refill your account!");
			return false;
		}
	}
	// create a method called getBalance
	public double getBalance() {
		return balance;
	}
	// create a method called buyContent
	public void buyContent(Content content) {
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		if (premUser != false ) {		// in case of premium user
			try {
				if(this.getBalance()<content.getPrice() * 0.8)	// validate sufficiency of balance
					throw new Exception();
				balance -=  content.getPrice() * 0.8;   // update balance
				content.increaseDownloads();			// update downloads
				contentsBought.add(content);			// add to contents bought by user
				System.out.println(content.getName() + " purchased at $" + formatter.format(content.getPrice()*0.8)); // Premium user gets 20% discount.
				System.out.println(name + "'s remaining balance is " + " $" + formatter.format(balance));			
				
			}
			catch (Exception e) {
				System.err.println("Insufficient balance, please refill account!");
			}
							
		}
		else {
			try {
				if(this.getBalance()<content.getPrice())	// validate sufficiency of balance
					throw new Exception();
				balance -=  content.getPrice() ;  		 // update balance
				content.increaseDownloads();			// update downloads
				contentsBought.add(content);			// add to contents bought by user
				System.out.println(content.getName() + " purchased at $" + formatter.format(content.getPrice()));
				System.out.println(name + "'s remaining balance is " + " $" + formatter.format(balance));
			}
			catch (Exception e) {
				System.err.println("Insufficient balance, please refill account!");
			}		
		}
	}
	
	// create a method called showContentBought
	public void showContentBought() {
		if(contentsBought.size() == 0)
			System.out.println("No contents have been bought yet!");
		else
			System.out.println("Contents Bought:");
		for (int i=0; i<contentsBought.size(); i++) {
			System.out.println("ID: " + contentsBought.get(i).getID() 
					+ "; Name: " + contentsBought.get(i).getName() + "; Price: " + " $" + contentsBought.get(i).price);
		}      		
	}	
}


