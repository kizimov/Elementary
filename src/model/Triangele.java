package model;

public class Triangele {

    private String name; /*имя треугольника*/

    public double[] sides = new double[3]; /*стороны треугольника*/
    private double area; /*площадь треугольника*/

    // гетеры для Треугольника
    public String getName() {
        return name;
    }
    public double getArea() {
        return area;
    }

    public void setArea(double area) {/*вычисляем площадь треугольника по формуле Герона*/
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }
}