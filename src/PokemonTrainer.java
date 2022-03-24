import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {

    private String name;

    private List<Pokemon> pokemons;

    private FirePokemon charizard = new FirePokemon("Charizard", 80, 250, "pokéblock", "Charrriiizaard" );
    private WaterPokemon blastoise = new WaterPokemon("Blastoise", 78, 230, "poké puffs", "Bllaasssassstttoooooissseeee");
    private GrassPokemon venusaur = new GrassPokemon("Venusaur", 81, 260, "berries", "venussssssSSAAAUUURRRR");
    private GrassPokemon ditto = new GrassPokemon("Ditto", 65, 130, "copy pasta", "ditto ditto ditto" );
    private ElectricPokemon raichu = new ElectricPokemon("Raichu", 72, 215, "curry", "RAAIIIICCCCCHHU");
    private WaterPokemon gyarados = new WaterPokemon("Gyarados", 85, 260, "squid", "GYYYYYYAAAAAAAAAAAAAARAAAAAAAAAAAAAAAAA");

    // Constructor

    public PokemonTrainer() {

    }

    public PokemonTrainer(String name) {
        this.name = name;
    }

    public PokemonTrainer(String name, List<Pokemon> pokemons, FirePokemon charizard, WaterPokemon blastoise, GrassPokemon venusaur, GrassPokemon ditto, ElectricPokemon raichu, WaterPokemon gyarados) {
        this.name = name;
        this.pokemons = pokemons;
        this.charizard = charizard;
        this.blastoise = blastoise;
        this.venusaur = venusaur;
        this.ditto = ditto;
        this.raichu = raichu;
        this.gyarados = gyarados;
    }

    // Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public FirePokemon getCharizard() {
        return charizard;
    }

    public void setCharizard(FirePokemon charizard) {
        this.charizard = charizard;
    }

    public WaterPokemon getBlastoise() {
        return blastoise;
    }

    public void setBlastoise(WaterPokemon blastoise) {
        this.blastoise = blastoise;
    }

    public GrassPokemon getVenusaur() {
        return venusaur;
    }

    public void setVenusaur(GrassPokemon venusaur) {
        this.venusaur = venusaur;
    }

    public GrassPokemon getDitto() {
        return ditto;
    }

    public void setDitto(GrassPokemon ditto) {
        this.ditto = ditto;
    }

    public ElectricPokemon getRaichu() {
        return raichu;
    }

    public void setRaichu(ElectricPokemon raichu) {
        this.raichu = raichu;
    }

    public WaterPokemon getGyarados() {
        return gyarados;
    }

    public void setGyarados(WaterPokemon gyarados) {
        this.gyarados = gyarados;
    }
}
