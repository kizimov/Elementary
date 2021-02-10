package service;

import model.Triangle;
import utility.TriangeleUtils;

import java.io.IOException;

public class TriangleService {

    public Triangle setParameters(String clianStr) throws IOException {/*получаем из строки ввода имя и длины сторон*/
        Triangle triangle = new Triangle();
        String[] item = new String[4];
        item = clianStr.split(",");
        triangle.setName(item[0]);
        triangle.sides[0] = Double.parseDouble(item[1]);
        triangle.sides[1] = Double.parseDouble(item[2]);
        triangle.sides[2] = Double.parseDouble(item[3]);

        TriangeleUtils.matchingTriangle(triangle.sides);//передали на проверку соответствия треугольнику

        double p = (triangle.sides[0] + triangle.sides[1] + triangle.sides[2]) / 2;
        triangle.setArea(Math.sqrt(p * (p - triangle.sides[0]) * (p - triangle.sides[1]) * (p - triangle.sides[2])));
        return triangle;
    }
}