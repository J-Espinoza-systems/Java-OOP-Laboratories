package VehiculoEjemplo;

import java.util.ArrayList;

public class Vehiculo {

    private String marca;
    private String  modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }
    public void mostrarTodo(){
        System.out.print("Marca: " + marca + " | Modelo: " + modelo + " | Precio: S/ " + precio);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}


