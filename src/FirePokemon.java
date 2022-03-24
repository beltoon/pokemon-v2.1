import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private static final String type = "fire";
    private List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }


    //aanvallen
    public void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Fire Lash");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 10hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 30);
            System.out.println(enemy.getName() + " loses 30hp!");
        } else {
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " loses 25hp!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Flame Thrower");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 10hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 30);
            System.out.println(enemy.getName() + " loses 30hp!");
        } else {
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " loses 25hp!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Pyro Ball");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 10hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 30);
            System.out.println(enemy.getName() + " loses 30hp!");
        } else {
            enemy.setHp(enemy.getHp() - 25);
            System.out.println(enemy.getName() + " loses 25hp!");
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Inferno");
        if (enemy.getType().equals("fire")) {
            enemy.setHp(enemy.getHp() - 10);
            System.out.println(enemy.getName() + " loses 10hp!");
        } else if (enemy.getType().equals("electric")) {
            enemy.setHp(enemy.getHp() - 20);
            System.out.println(enemy.getName() + " loses 20hp!");
        } else if (enemy.getType().equals("grass")) {
            enemy.setHp(enemy.getHp() - 30);
            System.out.println(enemy.getName() + " loses 30hp!");
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
