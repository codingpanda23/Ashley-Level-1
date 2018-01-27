package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton mole = new JButton("Mole");

void drawButton(int random) {
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(250, 300);
	frame.setTitle("Whack the Mole for Filet-Mignon and Glory");
	mole.addActionListener(this);
	
	for (int i = 0; i < 24; i++) {
		if (i = random) {
			panel.add(mole);
		}
	}
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
