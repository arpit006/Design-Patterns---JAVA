package com.arpit.designpatterns.observer_pattern;

import com.arpit.designpatterns.observer_pattern.observable.MathsObservable;
import com.arpit.designpatterns.observer_pattern.observer.AdditionObserver;
import com.arpit.designpatterns.observer_pattern.observer.DifferenceObserver;
import com.arpit.designpatterns.observer_pattern.observer.MultiplicationObserver;
import com.arpit.designpatterns.observer_pattern.observer.api.MathsObserver;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class ObserverTester {

    public static void main(String[] args) {
        MathsObservable mathsObservable = new MathsObservable();
        MathsObserver<Integer, Integer> additionObserver = new AdditionObserver();
        MathsObserver<Integer, Integer> differenceObserver = new DifferenceObserver();
        MathsObserver<Integer, Integer> multiplicationObserver = new MultiplicationObserver();

        mathsObservable.subscribe(additionObserver);
        mathsObservable.subscribe(differenceObserver);
        mathsObservable.subscribe(multiplicationObserver);

        mathsObservable.publish(new MathsPair<>(4, 5));
        mathsObservable.publish(new MathsPair<>(14, 7));
        mathsObservable.publish(new MathsPair<>(334, 543));

        mathsObservable.unsubscribe(additionObserver);
        mathsObservable.publish(new MathsPair<>(100, 200));

        mathsObservable.unsubscribe(multiplicationObserver);
        mathsObservable.publish(new MathsPair<>(1, 2));

        mathsObservable.subscribe(additionObserver);
        mathsObservable.publish(new MathsPair<>(11, 22));

        mathsObservable.subscribe(multiplicationObserver);
        mathsObservable.publish(new MathsPair<>(111, 222));

    }
}
