package VehiculoEjemplo;

import java.util.ArrayList;

public class GestionVehiculos {
    private ArrayList<Vehiculo>listaVehiculos;

    public GestionVehiculos(){
        this.listaVehiculos= new ArrayList<>();
    }

    public void mostrarTodo(){
        for (Vehiculo v: listaVehiculos){
            v.mostrarTodo();
        }
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
        System.out.println("Vehiculo "+vehiculo.getMarca()+ " "+ vehiculo.getModelo()+ " agregado");
    }
}
