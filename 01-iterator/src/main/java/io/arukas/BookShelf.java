package io.arukas;

/**
 * 书架用于存放book
 */
public class BookShelf implements Aggregate {

    // TODO: 可以用List试试
    // 书的集合
    private Book[] books;

    private int last = 0;

    /**
     * 创建指定大小的书架
     *
     * @param maxsize
     */
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    /**
     * 下标获取book
     *
     * @param index
     * @return
     */
    public Book getBookAt(int index) {
        return books[index];
    }

    /**
     * 存放一本书
     *
     * @param book
     */
    public void addBook(Book book) {
        this.books[last] = book;
        last++;
    }

    /**
     * 获取总的书本数
     *
     * @return
     */
    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

}
