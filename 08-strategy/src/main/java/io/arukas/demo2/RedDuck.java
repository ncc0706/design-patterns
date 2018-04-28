package io.arukas.demo2;

public class RedDuck extends Duck {

    public RedDuck() {
        this.speakable = new SpeakDuckLaguage();
    }

    @Override
    public void display() {
        System.out.println("my color is red.");
    }
}
