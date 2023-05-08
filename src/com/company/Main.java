package com.company;

public class Main {
    public static void main(String[] args) {
        CocheCRUDImpl coche = new CocheCRUDImpl();

        coche.delete();
        coche.save();
        coche.findAll();
    }
}
