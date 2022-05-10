import java.util.ArrayList;

public class Library {

    private ArrayList <Book> libraryBooks;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.libraryBooks = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int countNumberOfBooks(){
        return this.libraryBooks.size();
    }

    public void addBookToLibrary(Book book){
        if (!hasLibraryReachedCapacity()) {
            this.libraryBooks.add(book);
        }
    }

    public boolean hasLibraryReachedCapacity(){
        return countNumberOfBooks() >= this.capacity;
    }
}
