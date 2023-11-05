package calculator2;

import javax.swing.JOptionPane;

public class calculatordegree{

	public static void main(String[] args) {
		
		
		int celsius = Integer.parseInt(JOptionPane.showInputDialog("Enter the given degree celsius."));
		JOptionPane.showMessageDialog(null, "The given Degree celsius is "+celsius);
		// Eingabe von Celsius
		
		int fahrenheit = celsius * 9/5 + 32;
		JOptionPane.showMessageDialog(null, "Conversion: "+fahrenheit+" Degree Fahrenheit");
		// Umrechnung von Celsius in Fahrenheit und Ausgabe
		
	}	
}