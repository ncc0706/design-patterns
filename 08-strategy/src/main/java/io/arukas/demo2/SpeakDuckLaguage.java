package io.arukas.demo2;

public class SpeakDuckLaguage implements Speakable {
    @Override
    public void speak() {
        System.out.println("会说鸭语...");
    }
}
