import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Borrower borrower;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(15);
        borrower = new Borrower("Kevin");
        book1 = new Book("The Bourne Identity", "Robert Ludlum", "Spy Fiction");
        book2 = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", "Children's Fiction");
        book3 = new Book("English Dictionary", "Collins", "Non-Fiction");
    }

    @Test
    public void borrowerHasName(){
        assertEquals("Kevin", borrower.getName());
    }

    @Test
    public void canCountBorrowerCollection(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book1);
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void canLendBook(){
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        borrower.borrowBook(library, book1);
        borrower.borrowBook(library, book2);
        borrower.borrowBook(library, book3);
        assertEquals(3, borrower.countBooks());
    }

}
