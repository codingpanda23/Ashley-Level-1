package level1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShoppingList {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField field = new JTextField();
	
	frame.setVisible(true);
	frame.setTitle("Buy Stuff!!!");
	frame.add(panel);
	panel.add(button);
	panel.add(field);
	frame.pack();
	button.setText("Submit");
	//ashley iz awsome
	
	
}
}
