package hu.petrik.autointerface;

public class Porsche implements Auto {
    private double sebesseg;

    public Porsche(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    @Override
    public void gyorsul() {
        sebesseg += 10;
    }

    @Override
    public double getSebesseg() {
        return sebesseg;
    }

    @Override
    public String toString() {
        return String.format("%.2f", sebesseg) ;

    }
}
