package Inheritence;

class Animal{
    String name;
    int age;
    
    public void makeSound(){
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal{
    String bread;

    public void eat(){
        System.out.println("The dog eats chicken.");
    }
}