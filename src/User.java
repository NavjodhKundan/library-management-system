/*
 * This class defines a user and all the properties associated with user.
 */

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userId;
    private String fName;
    private String lName;
    private String email;
    private String password;
    protected List<Book> borrowedBooks;

    public User(String userId, String fName, String lName, String email, String password) {
        this.userId = userId;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void bookBorrowed(Book book) {
        this.borrowedBooks.add(book);
    }

    public void BookReturned(Book book) {
        this.borrowedBooks.remove(book);
    }

    public String toString(){
        return String.format("UserID: %s, First Name: %s, Last Name: %s, Email: %s",
                userId, fName, lName, email);
    }
}
