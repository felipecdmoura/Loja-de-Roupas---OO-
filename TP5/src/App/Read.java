package App;


import java.util.Scanner;

/**
 * instancia a classe de Read qual implementa metodos que facilitarão na obtenção de dados e evitar problemas com buffer.
 * @author Felipe e João
 * @version TP5 (Outubro 2021)
 */
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
	public static char getChar() {
		Scanner read = new Scanner(System.in);
		return read.next().charAt(0);
	}
	public static double getDouble() {
		Scanner read = new Scanner(System.in);
		return read.nextDouble();
	}
}
