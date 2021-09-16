package App;


import java.util.Scanner;

public class Read { //Classe para facilitar o uso do Scanner, visando principalmente evitar problemas com buffer.
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
	public static char getChar() {
		Scanner read = new Scanner(System.in);
		return read.next().charAt(0);
	}
	public static double getDouble() {
		Scanner read = new Scanner(System.in);
		return read.nextDouble();
	}
}
