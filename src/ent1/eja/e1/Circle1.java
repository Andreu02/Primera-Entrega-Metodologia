package ent1.eja.e1;

public class Circle1 { // Save as "Circle.java"
    // ZONA DE ATRIBUTOS
    private double radius;
    private String color;

    //ZONA DE MÉTODOS
        // Constructores
    public Circle1() {
        radius = 1.0;
        color = "red";
    }

    public Circle1(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }

        //getters
    public double getRadius() {
        return radius;
    }

        //otros
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
