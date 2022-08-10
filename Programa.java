package aplicacao01;

import java.util.Locale;
import java.util.Scanner;

import entities.Salario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salario sal = new Salario();
		
		System.out.print("Nome: ");
		sal.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		sal.sBruto = sc.nextDouble();
		System.out.print("Taxa: ");
		sal.taxa = sc.nextDouble(); 
		
		
		System.out.println();
		System.out.println("Funcionário: " + sal);
		System.out.println();
		System.out.print("Qual a porcentagem do incremento ao salário? ");
		double porcent = sc.nextDouble();
		sal.incrementSal(porcent);
		
		System.out.println();
		System.out.println("Resultado: " + sal);
		

		
		
		
		sc.close();

	}

}
