package com.company;

public class Samsung extends Phones {
    private int number;
    private String quality;

    public Samsung(String name, int number, String quality) {
        super(name);
        this.number = number;
        this.quality = quality;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Samsung peremety->");
    }
}
