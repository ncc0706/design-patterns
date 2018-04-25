package io.arukas;

import io.arukas.framework.Manager;
import io.arukas.framework.Product;
import io.arukas.framework.UnderlinePen;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        // 准备
        Manager manager = new Manager();

        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);


        // 生成
        Product strongMessage = manager.create("strong message");
        strongMessage.use("Hello World.");

        Product waringBox = manager.create("warning box");
        waringBox.use("Hello World.");

        Product slashBox = manager.create("slash box");
        slashBox.use("Hello World.");
    }
}
