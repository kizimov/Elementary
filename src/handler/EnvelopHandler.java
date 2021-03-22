package handler;

import model.Envelope;
import service.EnvelopeService;
import utility.ConsoleUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnvelopHandler implements Handler{

    public void manualInput() throws IOException {
        new EnvelopeService().plaiceInside(getEnvelop().getEnvelopeSide());
        if (ConsoleUtils.restart("\nЖелаете повторить? (Yes/No):")) manualInput();
    }

    public double[] myEnvelope = new double[4];/*размеры сторон конвертов. Первый [0-1], Второй [2-3]*/

    public Envelope getEnvelop() throws IOException {

        String[] side = {"высоты первого", "ширины первого", "высоты второго", "ширины второго"};
        /*для сообщений в строку сбора данных с консоли*/
        boolean shouldContinue; // маркер проверки
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.in – объект класса InputStream. Данный объект выполняет функцию стандартного потока ввода, т. е. ввода с клавиатуры. System.in
        // обеспечивает низкоуровневый ввод, при котором методом read() считываются байты.
        //Первая обертка – класс InputStreamReader, который преобразует набор байтов в символ. Класс BufferedReader
        // буферизует ввод, обеспечивая считывание из потока ввода целых строк,
        int i;
        double pars;
        for (i = 0; i < 4; i = i + 1) {
            shouldContinue = true;
            while (shouldContinue) {
                System.out.printf("Введите размер %s конверта ", side[i]);
                try {
                    pars = Double.parseDouble(reader.readLine());
                    ConsoleUtils.checkIfPositive(pars);
                    myEnvelope[i] = pars;
                    shouldContinue = false;
                } catch (IllegalArgumentException exception) {
                    System.out.println(exception.getMessage());
                }
            }
        }
        Envelope envelope = new Envelope(myEnvelope);
        return envelope;
    }
}