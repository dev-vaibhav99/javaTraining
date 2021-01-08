package com.vaibhav.training.abstraction;

public class Samsung implements Phone{

    private String processor;
    private String display;

    public Samsung(String processor, String display) {
        this.processor = processor;
        this.display = display;
    }

    public Samsung() {
    }

    @Override
    public void showFeatures() {
        System.out.println("Samsung{" +
                "processor='" + processor + '\'' +
                ", display='" + display + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "processor='" + processor + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
