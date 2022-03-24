import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private static final String type = "grass";
    private List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    //aanvallen
    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leaf Storm");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 10hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " loses 15hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " loses 15hp!");
        } else {
            enemy.setHp(enemy.getHp() - 35);
            System.out.println(enemy.getName() + " loses 35hp!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Solar Beam");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 10hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " loses 15hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " loses 15hp!");
        } else {
            enemy.setHp(enemy.getHp() - 35);
            System.out.println(enemy.getName() + " loses 35hp!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leech Seed");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 10hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " loses 15hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " loses 15hp!");
        } else {
            enemy.setHp(enemy.getHp() - 35);
            System.out.println(enemy.getName() + " loses 35hp!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leave Blade");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 10hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " loses 15hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " loses 15hp!");
        } else {
            enemy.setHp(enemy.getHp() - 35);
            System.out.println(enemy.getName() + " loses 35hp!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    // Getters and Setters



    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }


}
