package io.arukas;

public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    /**
     * 模板方法
     */
    public final void display(int num) {
        open();
        for (int i = 0; i < num; i++) {
            print();
        }
        close();
    }

}
