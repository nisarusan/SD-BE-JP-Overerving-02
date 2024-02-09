package nl.novi.javaprogrammeren.overerving;
public class Dog extends DomesticAnimal{
    public Dog(String name, char sex, String nameOwner, String favoriteFoodBrand, String breed) {
        super(name, sex, nameOwner, favoriteFoodBrand, breed);
    }

    @Override
    public void MakeSound() {
        System.out.println("Woof");
    }

}
