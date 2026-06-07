package arrayvsarraylist;
import java.util.ArrayList;

public class ArrayVsArrayListDemo {
	 public void mostrar() {

	        // Tamaño fijo
	        int[] numeros = {1, 2, 3};

	        // Tamaño dinámico
	        ArrayList<Integer> lista = new ArrayList<>();
	        lista.add(10);
	        lista.add(20);

	        System.out.println("Array: " + numeros[0]);
	        System.out.println("ArrayList: " + lista.get(0));
	    }
}
