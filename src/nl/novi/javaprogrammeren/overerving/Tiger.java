package nl.novi.javaprogrammeren.overerving;
import java.time.DayOfWeek;
public class Tiger extends WildAnimals {

    private int stripes;

    public Tiger(String name, char sex, DayOfWeek lastFed, String birthCountry, String habitat) {
        super(name, sex, lastFed, birthCountry, habitat);
    }

    public void MakeSound() {
        System.out.println("GRRRRRR");
    }

    public int getStripes() {
        return stripes;
    }

    public void setStripes(int stripes) {
        this.stripes = stripes;
    }

}
