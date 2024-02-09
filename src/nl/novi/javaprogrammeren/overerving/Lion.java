package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

public class Lion extends WildAnimals {
    int cubs;

    public Lion(String name, char sex, DayOfWeek lastFed, String birthCountry, String habitat, int cubs) {
        super(name, sex, lastFed, birthCountry, habitat);
        this.cubs = cubs;
    }

    public int getCubs() {
        return cubs;
    }

    public void setCubs(int cubs) {
        this.cubs = cubs;
    }
    @Override
    public void MakeSound(){
        System.out.println("GREAUWUW");
    }
}
