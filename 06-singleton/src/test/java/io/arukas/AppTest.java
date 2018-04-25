package io.arukas;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple Singleton.
 */
public class AppTest {

    @Test
    public void testSingleton() {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
