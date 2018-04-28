package io.arukas.demo2;

public abstract class Duck {

    public Flyable flyable;

    public void swim() {
        System.out.println(" I am swimming.");
    }

    public void performFly() {

        // 通过多态，决定如何飞...
        flyable.fly();
    }

    public abstract void display();

    public void setFlyable(Flyable flyable) {
        if(flyable == null){
            throw new RuntimeException("不能为空!");
        }
        this.flyable = flyable;
    }
}
