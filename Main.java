package com.company;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roto Tawar");
        Minuman susu = new Minuman();
        susu.setNamaHidangan("susu sapi");
        breakfast.setKonsumsi(roti, susu);
        listKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("Nasi putih");
        Minuman air = new Minuman();
        air.setNamaHidangan("Air Putih");

        lunch.setKonsumsi(nasi, air);
        listKonsumsi.add(lunch);

        System.out.println("Menu konsumsi");
        for (Konsumsi<Makanan, Minuman> Konsumsi : listKonsumsi){
            Makanan makanan = Konsumsi.getM();
            Minuman minuman = Konsumsi.getI();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }

    }
}

