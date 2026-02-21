package VehiculoEjemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        var s= new Scanner(System.in);
       GestionVehiculos inventario= new GestionVehiculos();


        var salir= false;
       do {
           System.out.println("""
                SISTEMA DE GESTION DE VEHICULOS
                1-Agregar Vehiculo.
                2-Mostrar Vehiculo.
                3-Salir.
                """);
           var opcion= Integer.parseInt(s.nextLine());
        switch (opcion){
            case 1-> {
                System.out.println("""
                        Selecciona Vehiculo
                        1-Moto
                        2-Carro
                        """);
                var tipoV= Integer.parseInt(s.nextLine());
                System.out.println("Ingresa Marca:");
                String marca= s.nextLine();
                System.out.println("Ingresa Modelo:");
                String modelo= s.nextLine();
                System.out.println("Ingresa Precio:");
                Double precio= Double.parseDouble(s.nextLine());
                if (tipoV==1){
                    System.out.println("Cilindrada: ");
                    int cilindrada= Integer.parseInt(s.nextLine());
                    Moto motoNueva= new Moto(marca,modelo,precio,cilindrada);
                    inventario.agregarVehiculo(motoNueva);
                    System.out.printf("Moto %s %s agregada.",marca,modelo);
                }else {
                    System.out.println("Número de puertas: ");
                    int nPuertas= Integer.parseInt(s.nextLine());
                    Auto carroNuevo= new Auto(marca,modelo,precio,nPuertas);
                    inventario.agregarVehiculo(carroNuevo);
                    System.out.printf("Carro %s %s agregado.",marca,modelo);
                }
                    }
            case 2->{
                inventario.mostrarTodo();
            }
            case 3->{
                salir=true;
                    System.out.println("Cerrando Sistema, Hasta luego!!!");
            }
            default ->
                System.out.println("Opcion incorrecta!!");


        }
       }while (!salir);
    }
}


