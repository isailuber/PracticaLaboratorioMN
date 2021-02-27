package abstraccion;

public abstract class SumaRestaEntreNumeros {
	
	// Atributo
		private int propiedad;
		public static final int CONSTANTE = 1;
		
		public SumaRestaEntreNumeros() {

			this.propiedad = 0;
		}

		// un metodo normal como en cualquier clase
		protected int sumar(int argumento1, int argumento2) {
			return argumento1 + argumento2;
		}

		// clase abstracta.
		public abstract int restar(int argumento1, int argumento2);

}
