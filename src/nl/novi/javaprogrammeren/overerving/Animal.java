package nl.novi.javaprogrammeren.overerving;

abstract public class Animal {


    //instance fields
    String name;
    char sex;

    //constructor
    public Animal(String name, char sex) {
        this.name = name;
        this.sex = sex;
    }

    //abstract classe dit moet bij een overwrite door de instantie goed gezet worden
    void MoveAnimal() {
        System.out.println("Moving now 0.25meter");
    }

    public abstract void MakeSound();

     public void Eat(String food) {
         System.out.println("Eating now: " + food);
     }

     public String getName() {
         return name;
     }

     public void sleep() {
         System.out.println("Sleeping for more then 8 hours");
     }

}
