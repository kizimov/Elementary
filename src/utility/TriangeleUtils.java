package utility;

import handler.TriangleHandler;

import java.io.IOException;
import java.util.InputMismatchException;

public class TriangeleUtils {

    public static void matchingTriangle(double[] sides) throws IOException { /*проверка на матиматическое соответствие параметрам треугольника*/

        boolean shouldContinue = true;
        while (shouldContinue) {
            try {
                if (sides[0] <= 0 || sides[1] <= 0 || sides[2] <= 0)
                    throw new InputMismatchException("не соответствие длин сторон треугольника");
                if (sides[0] + sides[1] <= sides[2] || sides[0] + sides[2] <= sides[1] || sides[1] + sides[2] <= sides[0])
                    throw new InputMismatchException("не соответствие длин сторон треугольника");
                shouldContinue = false;
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage());
                new TriangleHandler().manualInput();
            }
        }
    }
}