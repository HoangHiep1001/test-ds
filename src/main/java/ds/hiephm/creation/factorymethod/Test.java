package ds.hiephm.creation.factorymethod;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.DOGE);
        System.out.println(animal.getName());
    }
}
