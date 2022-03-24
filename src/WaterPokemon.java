import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private static final String type = "water";
    private List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "raindance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }


    //aanvallen
    public void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Surf");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 35);
            System.out.println(enemy.getName() + " loses 35hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 10hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " loses 15hp!");
        } else {
            enemy.setHp(enemy.getHp() - 15);
            System.out.println(enemy.getName() + " loses 15hp!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Hydro Pump");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 30);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else {
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " loses 20hp!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Hydro Canon");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 30);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else {
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " loses 20hp!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Rain Dance");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 30);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else {
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " loses 20hp!");
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
