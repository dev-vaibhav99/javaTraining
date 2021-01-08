package com.vaibhav.training.abstraction;

public class Realme implements  Phone{
    private String processor;
    private String display;

    public Realme() {
    }

    public Realme(String processor, String display) {
        this.processor = processor;
        this.display = display;
    }

    @Override
    public void showFeatures() {
        System.out.println("Realme{" +
                "processor='" + processor + '\'' +
                ", display='" + display + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Realme{" +
                "processor='" + processor + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
