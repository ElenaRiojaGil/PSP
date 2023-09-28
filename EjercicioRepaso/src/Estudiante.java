public class Estudiante {
	private String nombre;
	private int edades;
	private String matricula;

	public Estudiante(String nombre, int edades, String matricula) {
		this.nombre = nombre;
		this.edades = edades;
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdades() {
		return edades;
	}

	public void setEdades(int edad) {
		this.edades = edad;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}