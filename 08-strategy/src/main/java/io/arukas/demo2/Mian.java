package io.arukas.demo2;

public class Mian {
    public static void main(String[] args) {
        GreenDuck greenDuck = new GreenDuck();
        greenDuck.performFly();

        // 让其具有飞的能力
        greenDuck.setFlyable(new FlyWithWing());
        greenDuck.performFly();

        RedDuck redDuck = new RedDuck();
        redDuck.performSpeak();

        // 说人话了。。。
        redDuck.setSpeakable(new SpeakHumanLaguage());
        redDuck.performSpeak();
    }
}
