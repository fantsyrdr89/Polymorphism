package io.zipcoder.pets;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import io.zipcoder.pets.*;

public class HelloUser {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);
    static int numberOfPets;
    static HashMap<String, Pet> pets = new HashMap<String, Pet>();
    public static void main(String[] args){
        inputNumberOfPets();
        inputPets();
        for(Map.Entry<String, Pet> x : pets.entrySet()){
            System.out.print(x.getKey() + " the " + x.getValue().getClass().getSimpleName());
            System.out.println(" says " + x.getValue().speak());
        }

    }

    public static void inputNumberOfPets(){
        System.out.println("How many pets do you have?");
        numberOfPets = scanner.nextInt();
    }

    public static void inputPets(){
        for(int i = 0; i < numberOfPets; i++){
            System.out.println("What kind of pet is it?");
            String pet = scanner1.nextLine();
            System.out.println("What is it's name?");
            String name = scanner1.nextLine();
            createPets(pet, name);
        }
    }

    public static void createPets(String pet, String name){
        if(pet.equalsIgnoreCase("Cat")){
            Cat cat = new Cat();
            cat.setName(name);
            pets.put(cat.getName(), cat);
        } else if(pet.equalsIgnoreCase("Dog")){
            Dog dog = new Dog();
            dog.setName(name);
            pets.put(dog.getName(), dog);
        } else if(pet.equalsIgnoreCase("Fox")){
            Fox fox = new Fox();
            fox.setName(name);
            pets.put(fox.getName(), fox);
        }else{
            System.out.println("Get a better pet.");
        }

    }
}
