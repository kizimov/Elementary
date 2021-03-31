package main.service;

import main.model.Triangle;
import main.utility.ConsoleUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class ArrayTriangleService {
    //наработка массива треугольников, его сортировка и вывод
    HashMap<String, Double> mapTriangeles = new HashMap<>();/*словарь имяТреугольника - площадьТреугольника*/

    public void setArrayTriangele(String nameTriangele, double ariaTriangele) {/*сетер для словаря*/
        mapTriangeles.put(nameTriangele, ariaTriangele);
    }

    public void repeatEnter() throws IOException {/*запуск программы заполнения данных с повтором Yes/No */
        String fromConsole = "";
        String message = "Формат ввода (разделитель - запятая): <имя>, <длина стороны>, <длина стороны>, <длина стороны> ";
        String regex ="^\\w*,\\d+\\.?\\d*,\\d+\\.?\\d*,\\d+\\.?\\d*";
        fromConsole = ConsoleUtils.checkFormat(message,regex); //проверка правельности ввода строки с параметрами
        Triangle triangle = new TriangleService().setParameters(fromConsole);//возвращаем объект из строки
        setArrayTriangele(triangle.getName(), triangle.getArea());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Хотите добавить треугольники (Yes/No)  ");
        String answerStr = reader.readLine().toLowerCase(Locale.ROOT);
        if (answerStr.equals("y") || answerStr.equals("yes")) {
            repeatEnter();
        }
    }

    public void sortAndPrint() {/*сортировка и вывод на печать словаря из треугольников */
        mapTriangeles.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(System.out::println); // или любой другой конечный метод
    }
}