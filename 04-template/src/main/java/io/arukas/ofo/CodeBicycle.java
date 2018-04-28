package io.arukas.ofo;

public class CodeBicycle extends AbstractBicycle {
    @Override
    public void unlock() {
        System.out.println("========" + "密码开锁" + "========");
    }

    @Override
    public void ride() {
        System.out.println(getClass().getSimpleName() + "骑起来很拉风");
    }

    @Override
    public void lock() {
        System.out.println("lock...");
    }

    @Override
    public void pay() {
        System.out.println("pay 支付.....");
    }

    public void isNeedUnlock(boolean isNeedUnlock) {
        this.isNeedUnlock = isNeedUnlock;
    }
}
