package io.arukas.delegate;

public class PrintBannerDelegate extends Print{

    private Banner banner;

    public PrintBannerDelegate(String value){
        this.banner = new Banner(value);
    }

    @Override
    public void printWeak() {
        banner.showWithAster();
    }

    @Override
    public void printStrong() {
        banner.showWithParen();
    }
}
