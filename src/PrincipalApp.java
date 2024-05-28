import java.util.ArrayList;

public class PrincipalApp {
	
	/**
	 * creacion del metodo que contiene la funcionalidad principal
	 * @param args
	 */
	public static void main (String [] args) {
		ArrayList<Integer> edades = new ArrayList<Integer>();
		int edad;
		String frase;
		
		
		for(int i=0; i<10; i++) {
			edad=(int)(1+Math.random()*100);
			edades.add(edad);
		}
		
		AnalisisEdad analizarEdades = new AnalisisEdad (edades);
		
		frase = analizarEdades.devolverFrase(edades);
		System.out.println(frase);
	}//FIN MAIN

}//FIN CLASS