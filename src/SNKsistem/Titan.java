package SNKsistem;

public class Titan extends PersonajeAnime{
    private String tipoDeTitan;

    public Titan(String nombre,String serie, String tipoDeTitan){
        super(nombre,serie);
        this.tipoDeTitan=tipoDeTitan;
    }
    @Override
    public void Presentarse(){

        super.Presentarse();
        System.out.printf("""
                Tipo de titan: %s%n
                """,this.tipoDeTitan);


    }
}
