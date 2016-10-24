package hojadetrabajo8;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;



public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String file = "C:\\Users\\Didier\\Desktop\\HojaDeTrabajo8\\src\\hojadetrabajo8\\pacientes.txt";
		String[] seccionFrase; //separador de frases
		BufferedReader br = new BufferedReader(new FileReader(file));
	    String linea;
	    
	    Vector<Paciente> pacientes = new Vector<Paciente>();
	    
        try {
			while ((linea = br.readLine()) != null) {
				//separador de frases
			    seccionFrase=linea.split(",");
			    pacientes.add(new Paciente(seccionFrase[0], seccionFrase[1], seccionFrase[2]));
			    //System.out.print(separador[0]+separador[1]+separador[2]);
			}
		} catch (IOException e) {
			System.out.println("error");
		}
//Se muestra en pantalla el listado de pacinttes ingresados originalmente en el texto 
        System.out.println("Lista (desordenada) de pacientes ingresados al hospital:");
        for(int cont=0; cont<pacientes.size(); cont++){
            System.out.println(pacientes.get(cont));
		}
        String ordenRelevancia="";
		System.out.println("\n\nLista Ordenada (de mayor a menor relevancia) de acuerdo a prioridad de atención (Implementacion VectorHeap):");	
		
		VectorHeapIM vectNum2 = new VectorHeapIM(pacientes);
		int size=vectNum2.size();		
		for(int i=0; i<size; i++){
			Paciente paciente = (Paciente)vectNum2.remove();
			ordenRelevancia += paciente.toString()+"\n";
		}
		System.out.println(ordenRelevancia);
                ordenRelevancia="";
           System.out.println("\n\nLista Ordenada (de mayor a menor relevancia) de acuerdo a prioridad de atención (Java Collection Framework):");
        VectorHeap vect = new VectorHeap(pacientes);		
        while(vect.iterator().hasNext()){
			Paciente paciente = (Paciente) vect.poll();
			ordenRelevancia += paciente.toString()+"\n";
		}		
		System.out.println(ordenRelevancia);
	
}
}
