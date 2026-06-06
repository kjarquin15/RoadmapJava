package enumsdemo;

public class EnumsDemo {
	enum Dia {
        LUNES, MARTES, MIERCOLES
    }

    public void mostrar() {
        Dia hoy = Dia.LUNES;
        System.out.println(hoy);
    }
}
