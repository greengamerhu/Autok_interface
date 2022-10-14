package hu.petrik.autointerface;

import java.util.Scanner;

public class KonzolosAuto implements Auto {
    private double sebesseg;
    Scanner sc = new Scanner(System.in);
    public KonzolosAuto() {
        sebesseg = 0;
    }

    @Override
    public void gyorsul() {
        sebesseg += Double.parseDouble(sc.nextLine());
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
