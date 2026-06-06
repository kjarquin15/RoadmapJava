package initializerblock;

public class InitializerBlockDemo {
	 // Se ejecuta antes del constructor
    {
        System.out.println("Bloque inicializador ejecutado");
    }

    public InitializerBlockDemo() {
        System.out.println("Constructor ejecutado");
    }
}
