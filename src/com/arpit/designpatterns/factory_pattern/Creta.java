package com.arpit.designpatterns.factory_pattern;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class Creta implements Car {

    @Override
    public String getCompanyName() {
        return "HYUNDAI";
    }

    @Override
    public int getYearOfManufacture() {
        return 2018;
    }

    @Override
    public double getCost() {
        return 1500000.00;
    }
}
