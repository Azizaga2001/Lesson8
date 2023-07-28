package Lesson8;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 3, "USA");
        dog.eat();
        dog.sound();
        dog.sleep();
        dog.setHealthLevel(30);

        Animal cat = new Cat("Whiskers", 5, "UK");
        cat.eat();
        cat.sound();
        cat.sleep();
        cat.setHealthLevel(70);

        Animal bird = new Bird("Polly", 2, "Australia");
        bird.eat();
        bird.sound();
        bird.sleep();
        bird.setHealthLevel(60);

        Doctor doctor = new Doctor();
        doctor.treatAnimal(dog);  // Лечение животного
        doctor.treatAnimal(cat);  // Животное здорово
        doctor.treatAnimal(bird);  // Животное здорово
    }
}
