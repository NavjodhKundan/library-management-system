/*
 * This class make a list of all books using book class object.
 * And defines all functions related to books.
 */

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<Book> books;

    public Catalog(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    //adding book to list
    public boolean addBook(Book book) {
        if(this.books.contains(book)) {
            return false;
        }
        books.add(book);
        return true;
    }

    //deleting book from list
    public boolean removeBook(Book book) {
        if(this.books.contains(book)) {
            books.remove(book);
            return true;
        }
        return false;
    }

    //listing all the books
    public List<Book> getBooks() {
        return books;
    }

    //printing all books that available
    public void getAvailableBooks() {
        for(Book book : books) {
            if(book.isAvailable()) {
                System.out.println(book.toString());
            }
        }
    }

    //searching books from list
    //searching by ISBN
    public void getBookByISBN(String ISBN) {
        for(Book book : books) {
            if(book.getIsbn().equals(ISBN)) {
                System.out.println(book.toString());
            }
        }
    }

    //searching by title
    public void getBookByTitle(String title) {
        for(Book book : books) {
            if(book.getTitle().equals(title)) {
                System.out.println(book.toString());
            }
        }
    }

    //searching by author
    public void getBookByAuthor(String author) {
        for(Book book : books) {
            if(book.getAuthor().equals(author)) {
                System.out.println(book.toString());
            }
        }
    }

    //searching by genre
    public void getBookByGenre(String genre) {
        for(Book book : books) {
            if(book.getGenre().equals(genre)) {
                System.out.println(book.toString());
            }
        }
    }
}
