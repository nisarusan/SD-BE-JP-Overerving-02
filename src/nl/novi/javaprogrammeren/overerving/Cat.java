package nl.novi.javaprogrammeren.overerving;

public class Cat extends DomesticAnimal {

    public CatType catType;

    public Cat(String name, char sex, String breed, String nameOwner, String favoriteFoodBrand, CatType catType) {
        super(name, sex, breed, nameOwner, favoriteFoodBrand);
        this.catType = catType;
    }

    @Override
    public void MakeSound() {
        System.out.println(name + ": Miauw");
    }

    public void setCatType(CatType catType) {
        this.catType = catType;
    }

    public CatType getCatType() {
        return catType;
    }

    public enum CatType {
        INSIDE,
        OUTSIDE
    }
}
