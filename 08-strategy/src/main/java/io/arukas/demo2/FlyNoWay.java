package io.arukas.demo2;

public class FlyNoWay implements Flyable{
    @Override
    public void fly() {
        System.out.println("不会飞...");
    }
}
