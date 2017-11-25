package level1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setLayout(new BorderLayout());

		frame.setVisible(true);
		frame.add(panel);
		JButton button = new JButton();
		JTextField input = new JTextField(20);
		JTextField answer = new JTextField(20);
		panel.add(input);
		panel.add(button);
		panel.add(answer);
		button.setText("Converts to...");
		frame.pack();

	}
}
