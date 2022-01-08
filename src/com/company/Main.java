package com.company;

public class Main {

    public static void main(String[] args) {
        Phones[] phones={(Phones) creatObjekt("Redmi"),  creatObjekt("Samsung"),  creatObjekt("Iphone")};
        for (int i = 0; i < phones.length; i++) {
                phones[i].print();

        }
    }

    public static Phones creatObjekt(String className) {

        switch (className) {
            case "Redmi":
                Redmi redmi = new Redmi("nout10","ips","snapdragon");
                return redmi;
            case "Samsung":
                Samsung samsung = new Samsung("a31",300,"superQualityPhone");
                return samsung;

            case "Iphone":
                Iphone iphone=new Iphone("xr",200,"");
            return iphone;
        }

        return null;
    }
}
