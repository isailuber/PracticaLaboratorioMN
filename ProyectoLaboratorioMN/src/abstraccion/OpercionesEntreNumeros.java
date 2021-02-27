package abstraccion;

public class OpercionesEntreNumeros extends SumaRestaEntreNumeros {
	@Override
	public int restar(int argumento1, int argumento2) {
		return argumento1 - argumento2;
	}

	// llama al metodo protected de la clase publica.
	public int sumar(int argumento1, int argumento2) {

		// para llamar al metodo de la clase padre
		// usamos la palabra clave "super".
		return super.sumar(argumento1, argumento2);
	}
}