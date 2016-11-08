package prueba;

import beans.InterpetreEspanol;
import beans.Traductor;

public class PruebaInterprete {
	public static void main(String[] args) {
		Traductor traductor = new Traductor();
		InterpetreEspanol interprete = new InterpetreEspanol();
		// El interprete se inyecta manualmente
		// Y solamente puede recibir un interprete en Espa�ol
		// No un interprete en Ingl�s u otros idiomas
		traductor.setInterprete(interprete);
		traductor.setNombre("Carlos Arriaga");
		traductor.hablar();
	}
}
