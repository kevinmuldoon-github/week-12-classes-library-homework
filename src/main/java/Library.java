import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList <Book> libraryBooks;
    private HashMap<String, Integer> bookGenres;
    private int capacity;

    public Library(int capacity) {
        this.capacity = capacity;
        this.libraryBooks = new ArrayList<>();
        this.bookGenres = new HashMap();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public HashMap<String, Integer> getBookGenres() {
        return bookGenres;
    }

    public int countNumberOfBooks(){
        return this.libraryBooks.size();
    }

    public void addBookToLibrary(Book book){
        if (!hasLibraryReachedCapacity()) {
            this.libraryBooks.add(book);
        }
    }

    public Book removeBookFromLibrary(Book book){
        return this.libraryBooks.remove(libraryBooks.indexOf(book));

    }

    public boolean hasLibraryReachedCapacity(){
        return countNumberOfBooks() >= this.capacity;
    }

    public void buildGenreHashmap(){
        // loop around library of books
        for (int i=0; i < countNumberOfBooks(); i++) {
            Book book = libraryBooks.get(i);
            String genre = book.getGenre(); // find the genre of the book passed in

            if(this.bookGenres.containsKey(genre)){
                int counter = bookGenres.get(genre);
                counter++; // increment counter if genre already exists
                this.bookGenres.put(genre, counter); // update hashmap

            } else {
                    this.bookGenres.put(genre, 1); // add new genre to hashmap
            } // end if/else


        } // end for loop
    }

    public int checkGenreFrequency(String genre){
        return this.bookGenres.get(genre);
    }

}
