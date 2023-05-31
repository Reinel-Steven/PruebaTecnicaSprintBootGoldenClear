package pruebas;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class lecturaCadena {

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			String minusculas = str.toUpperCase();
			String mayusculas = str.toLowerCase();
			String primeros2 = str.substring(0,2);
			String ultimos2 = str.substring(str.length()-2, str.length());
			List<String> ss = Arrays.asList( str.split(str.substring(str.length()-1)));
			
			String asteriscos = "***" + str + "***";
			String invertida = new StringBuilder(str).reverse().toString();
			
			System.out.println("minusculas " + minusculas);
			System.out.println("mayusculas " + mayusculas);
			System.out.println("primeros2 " + primeros2);
			System.out.println("ultimos2 " + ultimos2);
			System.out.println("letra repetida " + ss.size());
			System.out.println("asteriscos " + asteriscos);
			System.out.println("invertida " + invertida);
		}
}
