# PlayStore_Java
A **PlayStore** is a standalone digital marketplace that allows users to browse and download mobile applications (APPs). The PlayStore also serves as a digital store offering publications like e-books and digital magazines. Applications and publication items in the PlayStore are either free or can be bought for a price.
The program I have created will allow the creation of a store, filling it with products, creating users and simulating their interaction with the store (purchasing products, adding comments etc).

There are 7 options you can choose from and they are listed below:
1. Upgrading a member to premium account;
2. Purchasing one item for one user;
3. Listing all available contents;
4. Showing all purchased items of a user;
5. Showing all comments of a content;
6. Showing all content items of a particular type;
7. Exit;

Under PlayStore this application, there are two large sections, User and Content. Both User and Content have their unique ID. Under Content, there are two subclasses, Application and Publication. Inside Publication, there are two subclasses, Book and Magazine. 
* UserID: u1,u2... 
* ApplicationID: g1,g2...
* BookID: b1,b2...
* MagazineID: m1,m2...

For specific details, please refer to **PlayStoreMain.java** file.

## Program Execution
```
cd foldername
```

```
javac *.java
```

```
java PlayStoreMain
```
