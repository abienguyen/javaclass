package vn.tvn.interface_demo;

import org.apache.commons.lang3.StringUtils;

public class RunDemo {

    public static void main(String[] args) {
//        var type = "";
//        if (StringUtils.equals(type, "pig")){
//            var pig = new Pig();
//            pig.animalSound();
//            pig.sleep();
//        } else if (StringUtils.equals(type, "dog")){
//            var dog = new Dog();
//            dog.animalSound();
//            dog.sleep();
//        }

        AnimalType animalType = new AnimalType();
        var animal = animalType.getAnimal("pig");
        animal.animalSound();
        animal.sleep();
    }
}
