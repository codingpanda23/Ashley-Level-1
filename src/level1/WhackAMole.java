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

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == mole) {
			speak("Supercalifragilisticexpialidocious-ness");
		} else {
			speak("You dorky dork dork.");
		}
		frame.dispose();
		Random rand = new Random();
		int num = rand.nextInt(25);
		new WhackAMole().createButton(num);
	}

	void createButton(int random) {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 250);
		frame.setTitle("Whack the Mole for Filet-Mignon and Glory");

		for (int i = 0; i < 24; i++) {
			if (i == random) {
				panel.add(mole);
				mole.addActionListener(this);
			} else {
				JButton button = new JButton();
				panel.add(button);
				button.addActionListener(this);
			}
		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
