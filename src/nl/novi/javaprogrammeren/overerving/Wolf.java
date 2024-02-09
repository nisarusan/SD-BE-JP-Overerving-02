package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

public class Wolf extends WildAnimals {
    String nameWolfPack;

    public Wolf(String name, char sex, DayOfWeek lastFed, String birthCountry, String habitat, String nameWolfPack) {
        super(name, sex, lastFed, birthCountry, habitat);
        this.nameWolfPack = nameWolfPack;
    }

    public String getNameWolfPack() {
        return nameWolfPack;
    }
    public void setNameWolfPack(String nameWolfPack) {
        this.nameWolfPack = nameWolfPack;
    }
    @Override
    public void MakeSound() {
        System.out.println("WOOOOOOOOOEF");
    }
}
