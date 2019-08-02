import java.text.DecimalFormat;
import java.util.*;

class User {
	private String userID;
	private String name;
	private String phoneNum;
	private double balance;
	private boolean premUser;
	private ArrayList<Content> contentsBought;
	
	public User(String userID, String name, String phoneNum, double balance, boolean premUser) {
		this.setUserID(userID);
		this.name = name;
		this.setPhoneNum(phoneNum);
		this.balance = balance;
		this.premUser = premUser;
		contentsBought = new ArrayList<Content>();
	}
	
	public String getName() {
		return name;
	}
	
	public User(String userID, String name, String phoneNum, boolean premUser) {
		this(userID, name, phoneNum, 0.0, premUser);
	}
	
	public User(String userID, String name, String phoneNum) {
		this(userID, name, phoneNum, 500.0, false);
	}

	public User(String userID, String name, String phoneNum, double balance) {
		this(userID, name, phoneNum, balance, false);
	}

	public boolean becomePremium() {
		if(premUser) {
			System.out.println("Already a premium user");
			return false;
		}
		if(balance >= 100) {
			balance = balance - 100;
			premUser = true;
			System.out.println("Congratulation! " + getName() + " is now a premium user!");
			return true;
		}
		else {
			System.out.println("Insufficient balance, please refill your account!");
			return false;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void buyContent(Content content) {
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		if (premUser != false) {
			try {
				if(this.getBalance() < content.getPrice() * 0.8) 
					throw new Exception();
				balance -= content.getPrice() * 0.8;
				content.increaseDownloads();
				contentsBought.add(content);
				System.out.println(content.getName() + " purchased at $" + formatter.format(content.getPrice()*0.8));
				System.out.println(name + "'s remaining balance is " + " $" + formatter.format(balance));
			}
			catch (Exception e) {
				System.err.println("Insufficient balance, please refill account!");
			}
		}
		else {
			try {
				if(this.getBalance() < content.getPrice()) 
					throw new Exception();
				balance -= content.getPrice();
				content.increaseDownloads();
				contentsBought.add(content);
				System.out.println(content.getName() + " purchased at $" + 
				formatter.format(content.getPrice()));
				System.out.println(getName() + "'s remaining balance is " + " $" + formatter.format(getBalance()));						
			}
			catch (Exception e) {
				System.err.println("Insufficient balance, please refill account!");
			}
		}
 	}
	
	public void showContentBought() {
		if(contentsBought.size() == 0)
			System.out.println("No contents have been bought yet!");
		else
			System.out.println("Contents Bought:");
		for(int i=0; i<contentsBought.size(); i++) {
			System.out.println("ID: " + contentsBought.get(i).getContentID() + 
					"; Name: " + contentsBought.get(i).getName() + " $" +
					contentsBought.get(i).getPrice());
		}
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String newUserID) {
		this.userID = newUserID;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum2) {
		this.phoneNum = phoneNum2;
	}

}
