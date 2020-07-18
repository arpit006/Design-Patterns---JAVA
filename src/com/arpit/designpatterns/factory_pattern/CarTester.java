package com.arpit.designpatterns.factory_pattern;

import java.util.Scanner;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class CarTester {

    public static void main(String[] args) {
        System.out.println("Select one from below list\n1. creta\n2. city\n3. ecosports");
        try(Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            CarFactory carFactory = new CarFactory();
            Car c = carFactory.getCar(s);
            System.out.println(s + " : " + c.getCompanyName() + " : " + c.getCost() + " : " + c.getYearOfManufacture());
        } catch (Exception e) {
            System.out.println("No car found for this type.");
        }
    }
}
