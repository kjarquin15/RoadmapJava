package overloading;

public class OverloadingDemo {
	 public int sumar(int a, int b) {
	        return a + b;
	    }

	    // Mismo método, diferente cantidad de parámetros
	    public int sumar(int a, int b, int c) {
	        return a + b + c;
	    }
}
