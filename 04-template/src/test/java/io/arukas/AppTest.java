package io.arukas;

import io.arukas.ofo.CodeBicycle;
import io.arukas.ofo.ScanBicycle;
import org.junit.Test;

public class AppTest {

    @Test
    public void charDisplayTest() {
        AbstractDisplay d1 = new CharDisplay('H');
        d1.display(2);
    }

    @Test
    public void strDisplayTest() {
        AbstractDisplay d2 = new StringDisplay("Hello World.");
        d2.display(10);
    }


    @Test
    public void bicycleTest() {

        ScanBicycle scanBicycle = new ScanBicycle();
        scanBicycle.isNeedUnlock(false);
        scanBicycle.use();

        CodeBicycle codeBicycle = new CodeBicycle();
        codeBicycle.isNeedUnlock(true);
        codeBicycle.use();

    }

}
