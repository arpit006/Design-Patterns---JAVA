package com.arpit.designpatterns.factory_pattern;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class City implements Car {

    @Override
    public String getCompanyName() {
        return "HONDA";
    }

    @Override
    public int getYearOfManufacture() {
        return 2012;
    }

    @Override
    public double getCost() {
        return 1200000.00;
    }
}
