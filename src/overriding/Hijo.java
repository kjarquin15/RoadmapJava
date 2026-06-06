package overriding;

public class Hijo  extends Padre {

    @Override
    public void mostrar() {
        System.out.println("Método sobrescrito en hijo");
    }

}
