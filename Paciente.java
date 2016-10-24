/*
 * Didier Salazar, 15487	
 * Esteban Avalos, 15059
 * Raul de Leon, 15112
 * HOJA DE TRABAJO 8, ALGORITMOS Y ESTRUCTURA DE DATOS
 */


package hojadetrabajo8;

//Clase donde se crean los objetos de tipo paciente 
public class Paciente<E> implements Comparable<E> {
	
	private String nombre;	//Nombre de paciente que ingresa
	private String descripcionSintoma;	//Sintoma de paciente 
	private String nivelAtencion;	//Codigo de Emergencia de Paciente 
	
	/**
	 * 
	 * @param Nombre Nombre del Paciente 
	 * @param Sintoma Sintoma del paciente 
	 * @param Code Codigo de Emergencia del paciente 
	 */
	public Paciente (String Nombre, String Sintoma, String Code) {
		nombre=Nombre;
		descripcionSintoma=Sintoma;
		nivelAtencion=Code;
	}
	
	/**
	 * 
	 * @return codigo de emergencia 
	 */
	public String getNivelAtencion(){
		return nivelAtencion;
	}
	
	@Override
	public int compareTo(E Pacient) {
		String Code=((Paciente)Pacient).getNivelAtencion();
		return nivelAtencion.compareTo(Code);
	}
	

	public String toString(){
		return nombre+", "+descripcionSintoma+", "+nivelAtencion;
	}

}
