package ent1.eja.e1;

public class Circle {
    // ZONA DE ATRIBUTOS
    private double radius = 1.0d;

    //ZONA DE METODOS
    public Circle() {
    }

    public Circle (double ratio) {
        this.radius = ratio;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double ratio){
        this.radius = ratio;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
