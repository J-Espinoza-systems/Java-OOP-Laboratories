package VehiculoEjemplo;

public class Auto extends Vehiculo{
    private int numeroP;

    public Auto( String marca, String modelo, double precio, int numeroP){
        super(marca,modelo,precio);
        this.numeroP= numeroP;
    }
    @Override
    public void  mostrarTodo(){
        System.out.println("---Carro----");
        super.mostrarTodo();
        System.out.println("|Número de puertas: "+ this.numeroP+".");
    }
}
