package com.vaibhav.training.abstraction;

public class AbstractionClient {

    public static void main(String[] args) {

        Phone realme =new Realme("SD 720G","sAMOLED");
        realme.showFeatures();

        Phone samsung = new Samsung("Exynos 900", "sAMOLED+");
        samsung.showFeatures();

        Phone apple = new Apple("A14 Bionic", "Dynamic AMOLED");
        apple.showFeatures();
    }
}
