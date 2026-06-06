package interfacesdemo;

public class Carro implements Vehiculo {

    @Override
    public void arrancar() {
        System.out.println("El carro arrancó.");
    }
}