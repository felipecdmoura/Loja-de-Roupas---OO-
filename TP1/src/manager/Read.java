package manager;

import java.util.Scanner;

public class Read {
	public static int getInt() {
		Scanner read = new Scanner(System.in);
		return read.nextInt();
	}
	public static float getFloat() {
		Scanner read = new Scanner(System.in);
		return read.nextFloat();
	}
	public static String getString() {
		Scanner read = new Scanner(System.in);
		return read.nextLine();
	}
}
