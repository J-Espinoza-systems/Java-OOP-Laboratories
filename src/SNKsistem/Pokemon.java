package SNKsistem;

public class Pokemon extends PersonajeAnime{
    private String tipoPokemon;
    private String rareza;
    private boolean shiny;

    public Pokemon(String nombre, String serie,String tipoPokemon,String rareza,Boolean shiny ){
        super(nombre,serie);
        this.tipoPokemon=tipoPokemon;
        this.rareza=rareza;
        this.shiny=shiny;
    }
    @Override
    public void Presentarse(){
        super.Presentarse();
        System.out.printf("""
                Tipo de pokemon: %s
                Rareza: %s
                Shiny: %b%n
                """,this.tipoPokemon,this.rareza,this.shiny);
    }
}
