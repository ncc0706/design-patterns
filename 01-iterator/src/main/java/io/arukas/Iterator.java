package io.arukas;

/**
 * 遍历集合的接口
 */
public interface Iterator {

    /**
     * 是否有下一个元素
     *
     * @return
     */
    public abstract boolean hasNext();

    /**
     * 获取下一个元素
     *
     * @return
     */
    public abstract Object next();

}
