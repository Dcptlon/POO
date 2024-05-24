package biblioteca;

public class Profesor extends Persona{
	private String especialidad;
	
	public Profesor(String especialidad, int cedula, String nombreApellido, String correo, String telefono) {
		super(cedula, nombreApellido, correo, telefono);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesor [especialidad=" + especialidad + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
