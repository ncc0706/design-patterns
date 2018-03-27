package io.arukas;

import io.arukas.adaper.PrintBannerAdapter;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {


    @Test
    public void adapter() {

        PrintBannerAdapter adapter = new PrintBannerAdapter("Hello");

        adapter.showWithParen();
        adapter.showWithAster();

    }

}
