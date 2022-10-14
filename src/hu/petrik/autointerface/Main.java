package hu.petrik.autointerface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Auto> autoList = new ArrayList<>();

    public static void main(String[] args) {
        Porsche p1 = new Porsche(200);
        p1.gyorsul();
        p1.gyorsul();
        p1.gyorsul();
        System.out.println(p1.getSebesseg()); ;
        Porsche p2 = new Porsche(100);
        Porsche p3 = new Porsche(301);
        p3.gyorsul();
        System.out.println("harmadik porsche: "  + p3.getSebesseg());
        Tesla t1 = new Tesla();
        System.out.println("Elso tesla: "+  t1);
        t1.gyorsul();
        System.out.println(t1);

        t1.gyorsul();
        System.out.println(t1);


        t1.gyorsul();
        t1.gyorsul();
        t1.gyorsul();
        System.out.println(t1);



        Tesla t2 = new Tesla();
        System.out.println("MAsodik tesla: "+  t2);
        t2.gyorsul();
        System.out.println(t2);
        autoList.add(p1);
        autoList.add(p2);
        autoList.add(p3);
        autoList.add(t1);
        autoList.add(t2);

        System.out.println(Leggyorsabb(autoList));

        KonzolosAuto k1 = new KonzolosAuto();
        k1.gyorsul();
        k1.gyorsul();
        System.out.println(k1.getSebesseg());
    }
    public static Auto Leggyorsabb(List<Auto> lista) {
        Auto fastest = lista.get(0);
        for (Auto  a : lista) {
            if (a.getSebesseg() > fastest.getSebesseg()) {
                fastest = a;
            }
        }
        return fastest;

    }

}
