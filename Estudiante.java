package InformacionEstudiante;

public class Estudiante {
	String codigo;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public Estudiante(String codigo, String nombre, String sexo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	String nombre;
	String sexo;
}

public class InfoEstudiante {
	
	private Estudiante e1;

	public static void main(String[] args) {
		Estudiante alumno = new Estudiante("H2O", "ESTEBAN", "hombre");
		
		System.out.println("codigo: "+alumno.codigo+ " " +alumno.nombre+" Español final: "+promediarEs() +" sexo: "+alumno.sexo);
		
	}
		
}
