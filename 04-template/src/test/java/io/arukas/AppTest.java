package io.arukas;

import org.junit.Test;

public class AppTest {

    @Test
    public void charDisplayTest() {
        AbstractDisplay d1 = new CharDisplay('H');
        d1.display(2);
    }

    @Test
    public void strDisplayTest(){
        AbstractDisplay d2 = new StringDisplay("Hello World.");
        d2.display(10);
    }

}
