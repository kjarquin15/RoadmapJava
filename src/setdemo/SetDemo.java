package setdemo;
import java.util.HashSet;
import java.util.Set;
public class SetDemo {
	public void mostrar() {

        Set<String> nombres = new HashSet<>();

        nombres.add("Juan");
        nombres.add("Juan");
        nombres.add("Pedro");

        System.out.println(nombres);
    }
}
