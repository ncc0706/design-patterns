package io.arukas;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("图解设计模式"));
        bookShelf.appendBook(new Book("Head-First设计模式"));
        bookShelf.appendBook(new Book("Redis实战"));
        bookShelf.appendBook(new Book("Web性能权威指南"));
        bookShelf.appendBook(new Book("重构-改善既有代码的设计"));
        bookShelf.appendBook(new Book("重构-改善既有代码的设计"));
        bookShelf.appendBook(new Book("重构-改善既有代码的设计"));
        bookShelf.appendBook(new Book("重构-改善既有代码的设计"));
        bookShelf.appendBook(new Book("重构-改善既有代码的设计"));
        bookShelf.appendBook(new Book("重构-改善既有代码的设计"));
        bookShelf.appendBook(new Book("重构-改善既有代码的设计"));
        bookShelf.appendBook(new Book("重构-改善既有代码的设计"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }

        System.out.println(bookShelf.getLength());
    }
}
