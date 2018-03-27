package io.arukas.delegate;

public class PrintBannerDelegate extends Print{

    // 持有被委托的实例
    private Banner banner;

    public PrintBannerDelegate(String value){
        this.banner = new Banner(value);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
