package com.arpit.designpatterns.observer_pattern.observable;

import com.arpit.designpatterns.observer_pattern.observer.api.MathsObserver;
import com.arpit.designpatterns.observer_pattern.MathsPair;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class MathsObservable {

    private List<MathsObserver<Integer, Integer>> subscribers = new ArrayList<>();

    private static ReentrantLock lock = new ReentrantLock();

    public MathsObservable() {
    }

    public void publish(MathsPair<Integer, Integer> obj) {
        System.out.println("Published record : " + obj);
        for(MathsObserver<Integer, Integer> subscriber : subscribers) {
            subscriber.compute(obj);
        }
    }

    public void subscribe(MathsObserver<Integer, Integer> observer) {
        try {
            lock.lock();
            if(!subscribers.contains(observer)) {
                subscribers.add(observer);
            }
            lock.unlock();
        } catch (Exception e) {
            System.out.println("Error Subscribing to The publisher feed... " + observer);
        }
    }

    public void unsubscribe(MathsObserver<Integer, Integer> observer) {
        try {
            lock.lock();
            subscribers.remove(observer);
            lock.unlock();
        } catch (Exception e) {
            System.out.println("No Subscriber found in the Subscription List: " + observer);
        }
    }
}
