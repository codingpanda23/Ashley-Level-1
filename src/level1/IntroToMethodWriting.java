package level1;

public class IntroToMethodWriting {

	public static void main(String[] args) {
		Echo("Spinosaurus", 6);
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void iRock() {
		System.out.println("Ashley Rocks!!!!!!!!");
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void Rocker(String name) {
		System.out.println(name + " Rocks!!!!!!!!!!!!!!!!!!!");
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void Truth(String singer) {
		if (singer == "Justin (Beaver) Beiber") {
			System.out.println(singer + " is ANNOYING");
		} else {
			System.out.println(singer + " is not annoying.");
		}
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void Echo(String animal, int repeat) {
		for (int i = 0; i < repeat; i++) {
			System.out.println(animal);
		}
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int add(int int1, int int2) {
		return int1 + int2;
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean isEven(int i) {
		if (i % 2 == 0) {
			System.out.println("It's EVEN!!!!!!");
		} else {
			System.out.println("It's NOT even. |:( |:(");
		}
	}
}
