import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Ejer3 {

    public static void main(String args[]) {
        ArrayList<Integer> ListaNumeros = new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número en la posición: " + i));
            ListaNumeros.add(numero);
        }
        
        System.out.println("Lista de números: " + ListaNumeros);
    }
}
