package com.arpit.designpatterns.observer_pattern.observer;

import com.arpit.designpatterns.observer_pattern.MathsPair;
import com.arpit.designpatterns.observer_pattern.observer.api.MathsObserver;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class DifferenceObserver implements MathsObserver<Integer, Integer> {

    //Dependency Injection preferred


    public DifferenceObserver() {
    }

    @Override
    public void compute(MathsPair<Integer, Integer> pair) {
        int diff = Math.abs(pair.getKey() - pair.getValue());
        System.out.println("Difference is : " + diff);
    }
}
