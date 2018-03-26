package io.arukas;

/**
 * 集合接口
 */
public interface Aggregate {

    /**
     * 注意这里的Iterator是自定义的接口
     *
     * @return
     */
    public abstract Iterator iterator();

}
