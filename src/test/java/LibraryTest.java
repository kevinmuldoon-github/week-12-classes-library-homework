import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

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
    public void canCountNumberOfBooks(){
        assertEquals(0, library.countNumberOfBooks());
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBookToLibrary(book1);
        assertEquals(1, library.countNumberOfBooks());
    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBookToLibrary(book1);
        library.removeBookFromLibrary(book1);
        assertEquals(0, library.countNumberOfBooks());
    }

    @Test
    public void checkLibraryHasCapacity(){
        assertEquals(15, library.getCapacity());
    }

    @Test
    public void canCapacityBeSet(){
        library.setCapacity(5);
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void canCheckIfLibraryStockIsFull(){
        assertEquals(false, library.hasLibraryReachedCapacity());
    }

    @Test
    public void checkBookCannotBeAdded(){
        library.setCapacity(1);
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        assertEquals(1, library.countNumberOfBooks());
    }



}
