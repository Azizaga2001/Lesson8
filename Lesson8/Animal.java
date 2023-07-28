package Lesson8;

public class Animal {
    private String name;
    private int age;
    private String origin;
    private int healthLevel;

    public Animal(String name, int age, String origin) {
        this.name = name;
        this.age = age;
        this.origin = origin;
        this.healthLevel = 100;
    }

    public void eat() {
        // Реализация для базового класса Animal
    }

    public void sound() {
        // Реализация для базового класса Animal
    }

    public void sleep() {
        // Реализация для базового класса Animal
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }
}


