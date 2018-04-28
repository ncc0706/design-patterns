package io.arukas.demo2;

public class GreenDuck extends Duck {

    public GreenDuck() {
        this.flyable = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("my color is green.");
    }
}
