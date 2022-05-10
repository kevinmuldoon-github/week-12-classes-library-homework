import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        book1 = new Book("The Bourne Identity", "Robert Ludlum", "Spy Fiction");
        book2 = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", "Children's Fiction");
        book3 = new Book("English Dictionary", "Collins", "Non-Fiction");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("The Bourne Identity", book1.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Robert Ludlum", book1.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Spy Fiction", book1.getGenre());
    }
}
