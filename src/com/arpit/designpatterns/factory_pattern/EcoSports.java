package com.arpit.designpatterns.factory_pattern;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class EcoSports implements Car {

    @Override
    public String getCompanyName() {
        return "FORD";
    }

    @Override
    public int getYearOfManufacture() {
        return 2014;
    }

    @Override
    public double getCost() {
        return 1000000.00;
    }
}
