/*
 * This class keeps record of books that are borrowed and defines
 * all the properties for this class
 */

import java.time.LocalDate;

public class BorrowedRecord {

    private String borrowerID;
    private Book book;
    private User user;
    private LocalDate borrowedDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    private static final int BorrowingDays = 3;

    public BorrowedRecord(String borrowerID, Book book, User user) {
        this.borrowerID = borrowerID;
        this.book = book;
        this.user = user;
        this.borrowedDate = LocalDate.now();
        this.dueDate = borrowedDate.plusDays(BorrowingDays);
        this.returnDate = null;
    }

    public String getBorrowerID() {
        return borrowerID;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String toString(){
        return String.format("ID: %s, Book: %s, User: %s, Borrowed Date: %s, " +
                        "Due Date: %s, Return Date: %s",
                borrowerID, book.getTitle(), user.getfName()+" "+user.getlName(),
                borrowedDate, dueDate, returnDate);
    }
}
