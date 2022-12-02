package excApostila;
import java.util.*;
public class novoVelho {
	public static void  main (String[]args) {
		Scanner in=new Scanner (System.in);
		String nNovo="nome", nVelho="nome", nome;
		int novo=1000000, velho=0, idade, i=1;
		do {
			System.out.println("Digite seu nome");
			nome = in.next();
			System.out.println("Digite sua idade");
			idade = in.nextInt();
			if (idade<novo) {
				novo = idade;
				nNovo = nome;
			}
			if (idade>velho) {
				velho = idade;
				nVelho = nome;
			}
			i++;
			
		}while (i<=10);
		System.out.println("O mais velho se chama "+nVelho+" e tem"+velho+"anos");
		System.out.println("O mais novo se chama "+nNovo+" e tem"+novo+"anos");
	}
}
