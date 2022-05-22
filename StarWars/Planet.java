package Java_OOP_Project.StarWars;

import java.util.ArrayList;
import java.util.List;

public class Planet extends SpaceObject {
    private final List<Moon> moons;

    public Planet(String name) {
        super(name);
        this.moons = new ArrayList<>();
    }

    public List<Moon> getMoons() {
        return moons;
    }

    protected void addMoon(Moon moon) {
        moons.add(moon);
    }

    protected void removeMoon(Moon moon) {
        moons.remove(moon);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Planet: " + super.getName() + "\nJedies:\n" + super.toString());
        output.append('\n').append("Moons of ").append(super.getName()).append(":\n");

        if (moons.isEmpty()) {     // check if there are moons
            output.append("none\n");
        }
        else {
            for (Moon m: moons) {
                output.append(m).append('\n');
            }
        }

        return output.toString();
    }
}
