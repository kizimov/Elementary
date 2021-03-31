package main.service;

import java.io.IOException;

public class EnvelopeService {

    public boolean plaiceInside(double[] myEnvelope) throws IOException {
// проверка поместятся ли конвертв один в один. Первый во второй или второй в первый.
        if (((myEnvelope[0] < myEnvelope[2] && myEnvelope[1] < myEnvelope[3]))
                || ((myEnvelope[0] < myEnvelope[3] && myEnvelope[1] < myEnvelope[2]))) {
            System.out.println("Конверты поместятся один в один");
            return true;
        }
        if (((myEnvelope[2] < myEnvelope[0] && myEnvelope[3] < myEnvelope[1]))
                || ((myEnvelope[3] < myEnvelope[0] && myEnvelope[2] < myEnvelope[1]))) {
            System.out.println("Конверты поместятся один в один");
            return true;
        } else {
            System.out.println("Конверты не поместятся один в один");
            return false;
        }
    }
}