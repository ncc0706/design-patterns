package io.arukas;

import io.arukas.framework.Factory;
import io.arukas.framework.Product;
import io.arukas.idcard.IDCardFactory;

public class App {

    public static void main(String[] args) {

        Factory factory = new IDCardFactory();

        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }

}
