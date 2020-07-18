package com.arpit.designpatterns.singleton_pattern;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class SingletonTester {

    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();
        SingletonClass singletonClass3 = SingletonClass.getInstance();
        singletonClass1.s = "SinGleTonPatTerN";
        System.out.println(singletonClass2.s);
        System.out.println(singletonClass1.s);
        System.out.println(singletonClass3.s);

        singletonClass2.s = singletonClass2.s.toUpperCase();
        System.out.println();
        System.out.println(singletonClass3.s);
        System.out.println(singletonClass2.s);
        System.out.println(singletonClass1.s);
        System.out.println();

        singletonClass3.s = singletonClass2.s.toLowerCase();
        System.out.println(singletonClass1.s);
        System.out.println(singletonClass2.s);
        System.out.println(singletonClass3.s);

        Thread t1 = new Thread(new SingletonMultiRunner());
        Thread t2 = new Thread(new SingletonMultiRunner());
        Thread t3 = new Thread(new SingletonMultiRunner());
        Thread t4 = new Thread(new SingletonMultiRunner());
        System.out.println();

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
