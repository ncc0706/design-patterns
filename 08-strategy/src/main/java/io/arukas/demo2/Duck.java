package io.arukas.demo2;

public abstract class Duck {

    protected Flyable flyable;

    protected Speakable speakable;

    public void swim() {
        System.out.println(" I am swimming.");
    }

    public void performFly() {

        // 通过多态，决定如何飞...
        flyable.fly();
    }

    public void performSpeak(){
        speakable.speak();
    }

    public abstract void display();

    public void setFlyable(Flyable flyable) {
        if (flyable == null) {
            throw new RuntimeException("不能为空!");
        }
        this.flyable = flyable;
    }

    public void setSpeakable(Speakable speakable) {
        if (speakable == null) {
            throw new RuntimeException("不能为空");
        }
        this.speakable = speakable;
    }
}
