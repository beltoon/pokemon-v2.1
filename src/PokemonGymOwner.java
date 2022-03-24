public class PokemonGymOwner extends PokemonTrainer {

    private String name;
    private PokemonTrainer brock = new PokemonTrainer("Brock");
    private String village;/*""*/

    public PokemonGymOwner() {
    }

    public PokemonGymOwner(String name, PokemonTrainer brock, String village) {
        this.name = name;
        this.brock = brock;
        this.village = village;
    }

    public PokemonGymOwner(String name, String name1, PokemonTrainer brock, String village) {
        super(name);
        this.name = name1;
        this.brock = brock;
        this.village = village;
    }

    //getter en setter

// later toegevoegd
    public PokemonTrainer getBrock() {
        return brock;
    }
}
