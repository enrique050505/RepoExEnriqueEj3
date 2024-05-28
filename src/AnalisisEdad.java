import java.util.ArrayList;


public class AnalisisEdad {
	
	private ArrayList<Integer> edades = new ArrayList<Integer>();

	public AnalisisEdad(ArrayList<Integer> edades) {
		this.edades = edades;
	}
	
	
	
	public String devolverFrase(ArrayList<Integer> edades) {
		String frase = null;
		int jubilados = 0, mayoresEdad = 0, menoresEdad = 0;
		
		for(int i=0; i<edades.size(); i++) {
			if(edades.get(i)<18) {
				menoresEdad= menoresEdad + 1;
			}else if (edades.get(i)>=18 && edades.get(i)<65) {
				mayoresEdad = mayoresEdad +1;
			}else if (edades.get(i)>=65){
				jubilados = jubilados +1;
			}
		}
		
		
		return "Menores de Edad " + menoresEdad + ", Mayores de Edad " + mayoresEdad + ", Jubilados " + jubilados;

	}//FIN DEVOLVER FRASE
	
}