package model;

public class Envelope {
    public Envelope(double[] envelopeSide) {
        this.envelopeSide = envelopeSide;
    }
    private double[] envelopeSide;
    public double[] getEnvelopeSide() {
        return envelopeSide;
    }
    public void setEnvelopeSide(double[] envelopeSide) {
        this.envelopeSide = envelopeSide;
    }
}