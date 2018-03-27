package io.arukas;

import org.junit.Test;

import java.nio.file.attribute.UserDefinedFileAttributeView;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void runApp() {

        System.out.println("Making root entries...");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");

        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);

        bindir.add(new File("vi", 100));
        bindir.add(new File("latex", 2000));
        rootdir.printList();

        System.out.println();
        System.out.println("Making user entries...");

        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");

        usrdir.add(yuki);
        usrdir.add(hanako);
        usrdir.add(tomura);

        yuki.add(new File("100.html", 200));
        yuki.add(new File("Composite.jar", 300));

        Entry t = new File("测试", 200);

        yuki.add(t);

        hanako.add(new File("kotlin", 100));
        tomura.add(new File("okhttp", 200));
        tomura.add(new File("httpclient", 300));

        yuki.remove(t);
        rootdir.printList();
    }

}
