package com.company;

public class Phones implements Printable{
    private String name;

    public Phones(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("телефоны ");

    }
}
