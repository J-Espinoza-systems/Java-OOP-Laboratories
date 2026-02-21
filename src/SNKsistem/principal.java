package SNKsistem;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        var s = new Scanner(System.in);
            GestionPersonajes inventarioAnime= new GestionPersonajes();


           var salir= false;
            do {
                System.out.printf("""
                        ****GESTION DE ANIME****
                        1- Agregar personaje.
                        2- Mostrar personajes.
                        3- Salir.
                        """);
                var opcion= Integer.parseInt(s.nextLine());

                switch (opcion){
                    case 1 ->{
                        System.out.printf("""
                                Seleccionar tipo de Personaje:
                                1- Pokémon
                                2- Titan
                                """);
                        var tipoPersonaje=Integer.parseInt(s.nextLine());

                        System.out.println("Ingresa Nombre: "); String nombre= s.nextLine();
                        System.out.println("Ingresar Serie: "); String serie= s.nextLine();
                        if (tipoPersonaje==1){
                            System.out.println("Ingresar tipos del Pokémon: "); String tipos= s.nextLine();
                            System.out.println("Ingresar Rareza: "); String rareza= s.nextLine();
                            System.out.println("Es Shiny?: ");Boolean shiny=Boolean.parseBoolean(s.nextLine());

                            Pokemon nuevoPoke= new Pokemon(nombre,serie,tipos,rareza,shiny);
                            inventarioAnime.agregarPersonaje(nuevoPoke);
                        }else {
                            System.out.println("Ingresar Tipo de Titan: "); String tipoT= s.nextLine();
                            Titan nuevoTitan= new Titan(nombre,serie,tipoT);
                            inventarioAnime.agregarPersonaje(nuevoTitan);
                        }
                    }
                    case 2-> inventarioAnime.mostrarPersonaje();
                    case 3-> {
                        salir= true;
                        System.out.println("Cerrando Sistema, Gracias por su visita!!!");
                    }
                }
            }while(!salir);
    }
}
