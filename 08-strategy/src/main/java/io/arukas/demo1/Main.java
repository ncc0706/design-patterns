package io.arukas.demo1;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        // 策略A
        context.factory("Win");
        context.contextInterface();

        // 策略B
        context.factory("Win3");
        context.contextInterface();
    }

}
