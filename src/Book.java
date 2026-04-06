/*
 * This is a template class for books which defines all the properties of a book.
 */

public class Book {

    private String title;
    private String author;
    private String isbn;
    private String genre;
    private boolean available;

    public Book(String title, String author, String isbn, String genre) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.available = true;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //checking if book is available
    public boolean isAvailable() {
        return available;
    }

    //setting book availability after book is borrowed or returned
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String toString() {
        return String.format("[%s] \"%s\"by %s (%s) - %s",
                title, author, isbn, genre, available ? "Available" : "Not Available");
    }
}
