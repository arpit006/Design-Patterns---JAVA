package com.arpit.designpatterns.factory_pattern;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class CarFactory {

    public Car getCar(String modelName) {
        if(modelName.equals("creta")) {
            return new Creta();
        }
        if(modelName.equals("city")) {
            return new City();
        }
        if(modelName.equals("ecosports")) {
            return new EcoSports();
        }
        throw new RuntimeException("No car for this model found......");
    }
}
