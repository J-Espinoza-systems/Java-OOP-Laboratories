package SNKsistem;

import java.util.ArrayList;

public class GestionPersonajes {
    private ArrayList<PersonajeAnime>listaPersonajes;

    public GestionPersonajes(){
        this.listaPersonajes= new ArrayList<>();
    }
    public void agregarPersonaje(PersonajeAnime p){
        if (p.equals(null)){
            System.out.println("Error al ingresar");
            return;
        }
        listaPersonajes.add(p);
        System.out.printf("Personaje %s de la serie %s agregado con exito!!!%n",p.getNombre(),p.getSerie());
    }
    public void mostrarPersonaje(){
        for (PersonajeAnime p:listaPersonajes){
            p.Presentarse();
        }
    }

}
