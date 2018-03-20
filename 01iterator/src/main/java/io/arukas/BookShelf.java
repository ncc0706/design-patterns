package io.arukas;

import java.util.ArrayList;
import java.util.List;

/**
 * 书架
 */
public class BookShelf implements Aggregate{

//    private Book[] books;

    private List<Book> books;

    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new ArrayList<Book>(maxsize);
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        this.books.add(book);
        last++;
    }

    public int getLength(){
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
