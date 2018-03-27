package io.arukas;

public abstract class Entry {

    protected Entry parent;

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

    /**
     * 获取完整路径
     * @return
     */
    public String getFullName(){
        StringBuffer fullname = new StringBuffer();
        Entry entry = this;
        do{
            fullname.insert(0, "/"+entry.getName());
            entry = entry.parent;
        } while (entry != null);
        return fullname.toString();
    }
}
