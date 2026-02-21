package VehiculoEjemplo;

public class Moto extends Vehiculo{
        private int cilindrada;
        public Moto(String marca, String modelo,double precio, int cilindrada){
            super(marca,modelo,precio);
            this.cilindrada=cilindrada;
        }
        @Override
        public void mostrarTodo(){
            System.out.println("---Moto----");
            super.mostrarTodo();
            System.out.println("|Cilindrada: "+this.cilindrada+" cc.");
        }
    }

