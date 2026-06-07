package exceptionhandling;

public class ExceptionHandlingDemo {
    public void dividir() {

        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: división por cero.");
        }
    }
}
