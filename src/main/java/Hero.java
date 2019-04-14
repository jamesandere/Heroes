import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String otherName;
    private int otherAge;
    private String otherPowers;
    private String otherWeakness;

    public Hero(String name, int age, String power, String weakness) {
        otherName = name;
        otherAge = age;
        otherPowers = power;
        otherWeakness = weakness;
    }

    public String getOtherName() {
        return otherName;
    }

    public int getOtherAge() {
        return otherAge;
    }

    public String getOtherPowers() {
        return otherPowers;
    }

    public String getOtherWeakness() {
        return otherWeakness;
    }
}
