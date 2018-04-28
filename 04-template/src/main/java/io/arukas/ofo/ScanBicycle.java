package io.arukas.ofo;

public class ScanBicycle extends AbstractBicycle {

    @Override
    public void unlock() {
        System.out.println("========" + "扫码开锁" + "========");
    }

    @Override
    public void ride() {
        System.out.println(getClass().getSimpleName() + "骑起来很拉风");
    }

    @Override
    public void lock() {
        System.out.println("骑行完上锁...");
    }

    @Override
    public void pay() {
        System.out.println("骑行完支付...");

    }

    public void isNeedUnlock(boolean isNeedUnlock) {
        this.isNeedUnlock = isNeedUnlock;
    }
}
