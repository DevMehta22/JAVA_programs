import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Book implements Serializable {
    private String bookTitle;
    private double bookPrice;
    private int bookId;

    public Book(String bookTitle, double bookPrice, int bookId) {
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public int getBookId() {
        return bookId;
    }

    @Override
    public String toString() {
        return "Book [Title=" + bookTitle + ", Price=" + bookPrice + ", ID=" + bookId + "]";
    }
}

public class booklist {
    public static void main(String[] args) {
        // Create a list to store Book objects
        ArrayList<Book> bookList = new ArrayList<>();

        // Add some sample books to the list
        bookList.add(new Book("Book A", 200.0, 1));
        bookList.add(new Book("Book B", 105.0, 2));
        bookList.add(new Book("Book C", 300.0, 3));
        bookList.add(new Book("Book D", 250.0, 4));
        bookList.add(new Book("Book E", 100.0, 5));

        // Write the list of Book objects to a file
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("bookdetails.dat"))) {
            outputStream.writeObject(bookList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the list of Book objects from the file
        ArrayList<Book> readBookList = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("bookdetails.dat"))){
            readBookList = (ArrayList<Book>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Search for a book by title
        String searchTitle = "Book C";
        for (Book book : readBookList) {
            if (book.getBookTitle().equals(searchTitle)) {
                System.out.println("Book found: " + book);
            }
        }

        // Find the book with the highest price
        Book highestPricedBook = Collections.max(readBookList, Comparator.comparing(Book::getBookPrice));
        System.out.println("Book with the highest price: " + highestPricedBook);
    }
}

