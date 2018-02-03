package level1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class WhackAMole implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton mole = new JButton("Mole");
public static void main(String[] args) {
	Random r = new Random();
	int num = r.nextInt(25);
	new WhackAMole().createButton(num);
}
void createButton(int random) {
	frame = new JFrame();
	panel = new JPanel();
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(250, 300);
	frame.setTitle("Whack the Mole for Filet-Mignon and Glory");
	mole.addActionListener(this);
	
	for (int i = 0; i < 24; i++) {
		if (i == random) {
			panel.add(mole);
			mole.addActionListener(this);
		}
		else {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
		}
	}
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource().equals(mole)) {
		speak("You have officialy proven that you are not a dork. Supercalifragilisticexpialidocious-ness");
	}
}
private void speak(String string) {
	// TODO Auto-generated method stub
	
}


}
