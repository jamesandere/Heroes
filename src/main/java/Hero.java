import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String otherName;
    private int otherAge;
    private int id;
    private String otherPowers;
    private String otherWeakness;
    private static List<Hero> instances = new ArrayList<>();

    public Hero(String name, int age, String power, String weakness) {
        otherName = name;
        otherAge = age;
        otherPowers = power;
        otherWeakness = weakness;
        instances.add(this);
        id = instances.size();
    }

    public String getOtherName() {
        return otherName;
    }

    public int getOtherAge() {
        return otherAge;
    }
}
