package com.arpit.designpatterns.builder_pattern;

/**
 * @author <a href = "mailto: iarpitsrivastava06@gmail.com"> Arpit Srivastava</a>
 */
public class Rectangle {

    private int height;

    private int width;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    private Rectangle() {}

    private Rectangle(RectangleBuilder rectangleBuilder) {
        this.height = rectangleBuilder.height;
        this.width = rectangleBuilder.width;
    }


    static class RectangleBuilder {

         int height;

         int width;

        static RectangleBuilder builder() {
            return new RectangleBuilder();
        }

         RectangleBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

         RectangleBuilder setWidth(int width) {
            this.width = width;
            return this;
        }

         Rectangle build() {
            return new Rectangle(this);
        }
    }


}
