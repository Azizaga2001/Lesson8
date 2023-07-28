package Lesson8;

public class Doctor {
    public void treatAnimal(Animal animal) {
        int healthLevel = animal.getHealthLevel();
        if (healthLevel < 50) {
            // Лечение животного
        } else {
            System.out.println("Животное здорово");
        }
    }
}