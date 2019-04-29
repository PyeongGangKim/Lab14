package edu.handong.csee.java.inheritance;

public class Cat extends Animal {

	public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Animal myCat = new Cat();//polymorphism
        Animal myAnimal = myCat;
        Animal myDog= new Dog();//polymorphism
        
        myCat.testClassMethod(); //hiding
        myDog.testClassMethod(); //hiding
        
        myAnimal.testInstanceMethod();//overriding
        myDog.testInstanceMethod();//overriding
        
        
    }

}
