package level1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker {
public static void main(String[] args) {
	makeButtons();
}
public static void makeButtons() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.setLayout(new BorderLayout());
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	button1 = createButton("Joke!");
	button2 = createButton("Punchline!");
	
}








private static JButton createButton(String string) {
	// TODO Auto-generated method stub
	return null;
}
}

