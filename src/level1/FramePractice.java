package Package;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FramePractice {
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setVisible(true);
	JButton b = new JButton("click me!");
	f.add(b);
	f.pack();
}
}
