package com.arpit.designpatterns.observer_pattern.observer;

import com.arpit.designpatterns.observer_pattern.MathsPair;
import com.arpit.designpatterns.observer_pattern.observer.api.MathsObserver;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class MultiplicationObserver implements MathsObserver<Integer, Integer> {

    @Override
    public void compute(MathsPair<Integer, Integer> pair) {
        long mul = (long) pair.getKey() * pair.getValue();
        System.out.println("Product is : " + mul);
    }
}
