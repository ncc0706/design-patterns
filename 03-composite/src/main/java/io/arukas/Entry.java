package io.arukas;

public abstract class Entry {

    // 获取名字
    public abstract String getName();

    // 获取大小
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    public abstract void printList(String prefix);

    public void printList() {
        printList("");
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
