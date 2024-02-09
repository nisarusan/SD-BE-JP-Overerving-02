package nl.novi.javaprogrammeren.overerving;

abstract public class DomesticAnimal extends Animal {
    public String nameOwner;
    public String favoriteFoodBrand;
    public String breed;

    public DomesticAnimal(String name, char sex, String nameOwner, String favoriteFoodBrand, String breed) {
        super(name, sex);
        this.nameOwner = nameOwner;
        this.favoriteFoodBrand = favoriteFoodBrand;
        this.breed = breed;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public String getFavoriteFoodBrand() {
        return favoriteFoodBrand;
    }

    public String getBreed() {
        return breed;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void setFavoriteFoodBrand(String favoriteFoodBrand) {
        this.favoriteFoodBrand = favoriteFoodBrand;
    }
}
