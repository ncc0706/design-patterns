package io.arukas.adaper;

public class PrintBannerAdapter extends Banner implements Print {

    public PrintBannerAdapter(String value) {
        super(value);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
