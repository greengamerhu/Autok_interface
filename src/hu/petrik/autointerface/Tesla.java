package hu.petrik.autointerface;

import java.util.Random;

public class Tesla  implements Auto{
    private double sebesseg;
    Random rnd = new Random();

    public Tesla() {
        sebesseg = rnd.nextDouble(61);
    }

    @Override
    public void gyorsul() {
        sebesseg += rnd.nextDouble(5, 16);
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
