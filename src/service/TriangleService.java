package service;

import model.Triangle;
import utility.TriangleUtils;

import java.io.IOException;

public class TriangleService {
    double[] sides = new double[3];
    public Triangle setParameters(String clianStr) throws IOException {/*получаем из строки ввода имя и длины сторон*/
        Triangle triangle = new Triangle();
        String[] item = new String[4];

        item = clianStr.split(",");
        triangle.setName(item[0]);
        sides[0] = Double.parseDouble(item[1]);
        sides[1] = Double.parseDouble(item[2]);
        sides[2] = Double.parseDouble(item[3]);
        TriangleUtils.matchingTriangle(sides);//передали на проверку соответствия треугольнику
        double p = (sides[0] + sides[1] + sides[2]) / 2;
        triangle.setArea(Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2])));
        return triangle;
    }
}