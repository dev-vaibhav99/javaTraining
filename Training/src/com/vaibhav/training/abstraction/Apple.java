package com.vaibhav.training.abstraction;

public class Apple implements Phone{
    private String processor;
    private String display;

    public Apple(String processor, String display) {
        this.processor = processor;
        this.display = display;
    }

    public Apple() {
    }

    @Override
    public void showFeatures() {
        System.out.println("Apple{" +
                "processor='" + processor + '\'' +
                ", display='" + display + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Apple{" +
                "processor='" + processor + '\'' +
                ", display='" + display + '\'' +
                '}';
    }
}
