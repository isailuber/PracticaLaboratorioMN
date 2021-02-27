package encapsulamiento;


public class EncapsulamientoGato {

	public String nombre;
	public int patas;

	public EncapsulamientoGato() {

		this.nombre = null;
		this.patas = 0;
	}

	public static void main(String[] args) {
		EncapsulamientoGato g = new EncapsulamientoGato();
		g.nombre = "Tomi";
		g.patas = 4;
		System.out.println("El gato se llama: " + g.nombre);
		System.out.println("El numero de patas de mi gato es:" + g.patas);

	}
}
