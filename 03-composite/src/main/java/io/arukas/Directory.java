package io.arukas;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {

    // 文件夹的名字
    private String name;

    // 文件夹中目录条目的集合
    private ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            size += entry.getSize();
        }
        return size;
    }

    /**
     * 增加条目
     *
     * @param entry
     * @return
     */
    public Entry add(Entry entry) {
        directory.add(entry);

        // for fullname
        entry.parent = this;

        return this;
    }

    public void remove(Entry entry) {
        directory.remove(entry);
    }

    @Override
    public void printList(String prefix) {

        System.out.println(prefix + "/" + this);
        Iterator iterator = directory.iterator();

        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.printList(prefix + "/" + name);
        }

    }
}
