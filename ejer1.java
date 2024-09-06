import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ejer1 {
	public static void main(String args[]) {
		ArrayList<String> ListaNombre=new ArrayList <String>();
		
		for (int i = 0; i < 5; i++) {
			ListaNombre.add(JOptionPane.showInputDialog("Ingrese el nombre en la pos:"+i));
		}
		
		System.out.println(ListaNombre);
		System.err.println();
		
		/*ListaNombre.add("cristian");
		ListaNombre.add("camila");
		ListaNombre.add("liliana");
		ListaNombre.add("mariana");
		ListaNombre.add("sebastian");
		ListaNombre.add("ana");
		ListaNombre.add("maria");
		ListaNombre.add("martha");
	
		System.out.println(ListaNombre);
		
		ListaNombre.clear();
		System.out.println(ListaNombre);*/
		
	}
	
}
