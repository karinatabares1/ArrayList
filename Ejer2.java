import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejer2 {

	 public static void main(String args[]) {
	        ArrayList<String> ListaPalabras = new ArrayList<String>();
	        
	        for (int i = 0; i < 3; i++) {
	            ListaPalabras.add(JOptionPane.showInputDialog("Ingrese una palabra en la posición: " + i));
	        }
	        
	        System.out.println("Palabras ingresadas en orden inverso:");
	        for (int i = ListaPalabras.size() - 1; i >= 0; i--) {
	            System.out.println(ListaPalabras.get(i));
	        }
	    }
}
