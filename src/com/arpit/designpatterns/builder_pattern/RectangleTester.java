package com.arpit.designpatterns.builder_pattern;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class RectangleTester {

    public static void main(String[] args) {
        Rectangle rectangle = Rectangle.RectangleBuilder.builder().setHeight(5).setWidth(6).build();
        System.out.println(rectangle.getHeight() + " : " + rectangle.getWidth());

        // will not work
//        Rectangle r1 = new Rectangle();
    }
}
