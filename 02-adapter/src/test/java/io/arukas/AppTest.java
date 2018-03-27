package io.arukas;

import io.arukas.adaper.PrintBannerAdapter;
import io.arukas.delegate.PrintBannerDelegate;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * 继承模式
     */
    @Test
    public void adapter() {
        PrintBannerAdapter adapter = new PrintBannerAdapter("Hello");
        adapter.printWeak();
        adapter.printStrong();

    }

    /**
     * 委托模式
     */
    @Test
    public void delegate(){
        PrintBannerDelegate delegate = new PrintBannerDelegate("Hello");
        delegate.printWeak();
        delegate.printStrong();
    }

}
