package com.arpit.designpatterns.observer_pattern.observer.api;

import com.arpit.designpatterns.observer_pattern.MathsPair;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public interface MathsObserver<K, V> {

    void compute(MathsPair<K, V> pair);
}
