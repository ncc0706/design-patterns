package io.arukas.ofo;

public abstract class AbstractBicycle {

    // 默认需要开锁
    protected boolean isNeedUnlock = true;

    /**
     * 钩子方法, 子类可复写
     *
     * @param isNeedUnlock
     */
    public void isNeedUnlock(boolean isNeedUnlock) {
        this.isNeedUnlock = isNeedUnlock;
    }

    // 开锁
    public abstract void unlock();

    // 骑行
    public abstract void ride();

    // 上锁
    public abstract void lock();

    // 支付
    public abstract void pay();

    // 使用
    public final void use() {
        if (isNeedUnlock) {
            unlock();
        } else {
            System.out.println("锁坏了， 不用解锁....");
        }
        ride();

        pay();

        lock();
    }


}
