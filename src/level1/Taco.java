package level1;

public class Taco {
	String meat = ("Beef");
	String sauce = ("Ketchup");
public static void main(String[] args) {
	
}

String getMeat(){
	return meat;
}
String getSauce(){
	return sauce;
}
void setMeat(String meat){
	this.meat = meat;
	System.out.println(meat);
}
void setSauce(String sauce){
	this.sauce = sauce;
	System.out.println(sauce);
}
}
