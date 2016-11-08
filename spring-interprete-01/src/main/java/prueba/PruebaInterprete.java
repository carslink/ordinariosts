package prueba;

import beans.InterpetreEspanol;
import beans.Traductor;

public class PruebaInterprete {
	public static void main(String[] args) {
		Traductor traductor = new Traductor();
		InterpetreEspanol interprete = new InterpetreEspanol();
		// El interprete se inyecta manualmente
		// Y solamente puede recibir un interprete en Español
		// No un interprete en Inglés u otros idiomas
		traductor.setInterprete(interprete);
		traductor.setNombre("Carlos Arriaga");
		traductor.hablar();
	}
}
