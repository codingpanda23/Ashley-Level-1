package level1;

import javax.swing.JOptionPane;

public class Name {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Give Me Your NAME!");
	for (int i = 0; i < name.length(); i++) {
		for (int j = 0; j < name.length()-i; j++) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
	}
}
}
