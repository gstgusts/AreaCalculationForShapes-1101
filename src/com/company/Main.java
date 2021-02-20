package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var rect = new Rectangle(4, 6);
        var cir = new Circle(5);

//        System.out.println(rect.getArea());
//        System.out.println(cir.getArea());

        List<Shape> shapes = new ArrayList<>();

        shapes.add(rect);
        shapes.add(cir);

        for (var shape :
                shapes) {
            System.out.println(shape.getArea());
        }

        Shape sh1 = new Circle(2);
    }
}
