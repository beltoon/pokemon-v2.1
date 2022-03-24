import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private static final String type = "electric";
    private List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    //    //aanvallen
    public void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunder Punch");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 10hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else {
            enemy.setHp(enemy.getHp() - 35);
            System.out.println(enemy.getName() + " loses 35hp!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Electro Ball");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 30);
            System.out.println(enemy.getName() + " loses 30hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 10hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else {
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " loses 25hp!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunder");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 30);
            System.out.println(enemy.getName() + " loses 30hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 10hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else {
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " loses 25hp!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Volt Tackle");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 30);
            System.out.println(enemy.getName() + " loses 30hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 10hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else {
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " loses 25hp!");
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
