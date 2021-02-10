package service;

import model.Triangele;
import utility.TriangeleUtils;

import java.io.IOException;

public class TriangeleService {

    public Triangele setParameters(String clianStr) throws IOException {/*получаем из строки ввода имя и длины сторон*/
        Triangele triangele = new Triangele();
        String[] item = new String[4];
        item = clianStr.split(",");
        triangele.setName(item[0]);
        triangele.sides[0] = Double.parseDouble(item[1]);
        triangele.sides[1] = Double.parseDouble(item[2]);
        triangele.sides[2] = Double.parseDouble(item[3]);

        TriangeleUtils.matchingTriangle(triangele.sides);//передали на проверку соответствия треугольнику

        double p = (triangele.sides[0] + triangele.sides[1] + triangele.sides[2]) / 2;
        triangele.setArea(Math.sqrt(p * (p - triangele.sides[0]) * (p - triangele.sides[1]) * (p - triangele.sides[2])));
        return triangele;
    }
}