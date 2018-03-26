package io.arukas;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void run() {

        BookShelf bookShelf = new BookShelf(4);
        bookShelf.addBook(new Book("图解设计模式"));
        bookShelf.addBook(new Book("Head-First设计模式"));
        bookShelf.addBook(new Book("Redis实战"));
        bookShelf.addBook(new Book("Web性能权威指南"));

        //System.out.println(bookShelf.getLength());
        Iterator iterator = bookShelf.iterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }

    }

}
