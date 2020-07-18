package com.arpit.designpatterns.singleton_pattern;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class SingletonMultiRunner implements Runnable {

    private SingletonClass singletonClass;

    @Override
    public void run() {
        singletonClass = SingletonClass.getInstance();
        singletonClass.s = "MultiThreading singleTon TEST";
        System.out.println("Count: " + SingletonClass.counter + " : " + singletonClass.s);
    }
}
