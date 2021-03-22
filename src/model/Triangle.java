package model;

public class Triangle {

    private String name; /*имя треугольника*/
    private double area; /*площадь треугольника*/

    public void setArea(double area) {
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

}