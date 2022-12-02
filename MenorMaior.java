package lacoExercicios2;
import java.util.*;
public class MenorMaior {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int i, idade,anoNasc, anoAtual, menor, maior;
		i=1;
		menor= 0;
		maior = 1;
		System.out.println("Digite o ano atual:");
		anoAtual = in.nextInt();
		for (i=0; i<=3; i++){
			System.out.println("Di0gite seu ano de nascimento:");
			anoNasc = in.nextInt();
			idade = anoAtual - anoNasc;
			if (idade<maior) {
				menor = idade;
			}if (idade>maior) {
				maior=idade;	
			}
			System.out.println("Sua idade é: "+idade);
			
		}
		System.out.println("O mais novo tem "+menor+" anos e o usuário mais velho tem="+maior+"anos");
		
	}
}
