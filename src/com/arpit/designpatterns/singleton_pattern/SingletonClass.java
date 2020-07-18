package com.arpit.designpatterns.singleton_pattern;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Lazy Initialization Singleton Pattern
 */
public class SingletonClass {

    private static SingletonClass singletonClass;

    private static ReentrantLock reentrantLock = new ReentrantLock();

    public static int counter = 0;

    public String s;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        //Using Synchronized Keyword
        /*if(singletonClass == null) {
            synchronized (SingletonClass.class) {
                if(singletonClass == null) {
                    singletonClass = new SingletonClass();
                    counter++;
                }
            }
        }*/

        //Using Reentrant Lock
        if(singletonClass == null) {
            reentrantLock.lock();
            try {
                if(singletonClass == null) {
                    singletonClass = new SingletonClass();
                    counter++;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return singletonClass;
    }
}
