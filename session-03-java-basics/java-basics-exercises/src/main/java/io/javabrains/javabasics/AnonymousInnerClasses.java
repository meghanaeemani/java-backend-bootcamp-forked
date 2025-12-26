package io.javabrains.javabasics;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */
abstract class Animal2 {
    abstract void makeSound();
}

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Animal2 dog = new Animal2(){
            @Override
            void makeSound(){
                System.out.println("it barks");

    }
};        Animal2 cat = new Animal2(){
            @Override
            void makeSound(){
                System.out.println("it meows");
            }
        };
        Animal2 lion = new Animal2(){
            @Override
            void makeSound(){
                System.out.println("it roars");
            }
        };
        Animal2[] animals = {dog, cat, lion};
        for (Animal2 animal : animals)
        animal.makeSound();
    }
}


