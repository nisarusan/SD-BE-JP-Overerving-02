package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

abstract public class WildAnimals extends Animal {

//    Van een Leeuw slaan we de naam, naam van het hok, geslacht, weekdag dat die
//    het laatst gevoed is en land van
//    herkomst op en de hoeveelheid kinderen.
//
//    Van een Tijger slaan we de naam, naam van het hok, geslacht, weekdag dat die
//    het laatst gevoed is en land van
//    herkomst op. Ook willen we het aantal strepen weten.
//
//    Van een Wolf slaan we de naam, naam van het hok, geslacht, weekdag dat die voor
//    het laatste gevoed is en land van
//    herkomst op. Ook willen we de naam van de roedel weten.

    public String habitat;
    private DayOfWeek lastFed;
    private final String birthCountry;

    public WildAnimals(String name, char sex, DayOfWeek lastFed, String birthCountry, String habitat) {
        super(name, sex);
        this.lastFed = lastFed;
        this.birthCountry = birthCountry;
        this.habitat = habitat;
    }
    public String getBirthCountry() {
        return birthCountry;
    }

    public DayOfWeek lastFed() {
        return lastFed;
    }

    public void setLastFed(DayOfWeek lastFed) {
        this.lastFed = lastFed;
    }


}
