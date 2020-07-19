package com.arpit.designpatterns.observer_pattern;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class MathsPair<K, V> {

    private K key;

    private V value;

    public MathsPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MathsPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
