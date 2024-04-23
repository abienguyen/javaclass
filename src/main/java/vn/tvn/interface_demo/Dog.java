package vn.tvn.interface_demo;

public class Dog implements Animal{

    @Override
    public void animalSound() {
        System.out.println("Dog: go go");
    }

    @Override
    public void sleep() {
        System.out.println("Dog: huz huz");
    }

    //abstract
}
