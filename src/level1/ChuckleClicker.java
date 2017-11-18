package level1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
	ChuckleClicker CC = new ChuckleClicker();
	CC.makeButtons();
}
public void makeButtons() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.setLayout(new BorderLayout());
	
	
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	button1.setText("Joke!");
	button2.setText("Punchline!!!");
	button1.addActionListener(this);
	button2.addActionListener(this);
	frame.pack();
	
	
}








private static JButton createButton(String string) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == button1) {
		JOptionPane.showMessageDialog(null, "What did one elevator say to the other elevator?");
	}
	if (e.getSource() == button2) {
		JOptionPane.showMessageDialog(null, " ''I think I'm coming down with something!'' ");
	}
	
}
}

