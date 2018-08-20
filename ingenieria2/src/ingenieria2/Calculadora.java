package ingenieria2;

import java.util.Scanner;

public class Calculadora {

		public static void main(String[] arg){
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese un número");
			int num1 = scanner.nextInt();
			
			System.out.println("Ingrese un número");
			int num2 = scanner.nextInt();
		
			int suma = num1 + num2;
			System.out.println("El resultado de la suma es: " +suma);

		}
		
}
