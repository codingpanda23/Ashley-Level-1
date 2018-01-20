package level1;

import java.util.Random;

import javax.swing.JOptionPane;

public class MusicalMethods {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, getLuckyNumber());
}
////////////////////////////////////////////////////////////////////////////////////////////////////////
static String whichPresent(String friendName) {
	if (friendName == "Stefanie") {
		return "makeup";
	}
	if (friendName == "Kasey") {
		return "more fluffy blankets";
	}
	if (friendName == "Erin") {
		return "Hippopotamus (you're welcome, Erin)";
	}else {
		return "BLAH BLAH BLAH BLAH....... who?";
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////
static boolean doPigsEat(String food) {
	if (food.equals("bananas")) {
		return true;
	}
	else {
		return false;
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////
static int getLuckyNumber() {
	Random rand = new Random();
	return rand.nextInt(654)+13;
}


}
