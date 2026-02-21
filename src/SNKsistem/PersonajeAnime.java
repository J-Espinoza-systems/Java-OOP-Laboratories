package SNKsistem;

public class PersonajeAnime {
    private String nombre;
    private String serie;

    public PersonajeAnime(String nombre,String serie){
        this.nombre=nombre;
        this.serie=serie;
    }
    public void Presentarse(){
        System.out.printf("""
                -----Personaje----
                Nombre: %s
                Serie: %s
                """,this.nombre,this.serie);
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
