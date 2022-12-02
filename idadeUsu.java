package lacoExercicios2;
import java.util.*;
public class idadeUsu {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int d, ano, idade;
		do {
			System.out.println("Digite seu ano de nascimento");
			ano = in.nextInt();
			idade = 2022 - ano;
			System.out.println("Sua idade é "+idade+ " anos");
			if (idade<=18){
				System.out.println("Você é menor de idade");
			}else {
				System.out.println("Você é maior de idade");
			}
			System.out.println("Deseja continuar a execução?");
			System.out.println("1-para SIM ou 2-para NÃO");
			d = in.nextInt();
		} while (d != 2);
		System.out.println("Programa encerrado");
		
	}
}
