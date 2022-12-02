package excApostila;
import java.util.*;
public class idade {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		String nome,nomeVelho, nomeNovo;
		int idade,velho=0, novo=1000,i=1;
		do {
			System.out.println("Digite a idade");
			idade=in.nextInt();
			System.out.println("Digite o nome");
			nome=in.next();
			nomeVelho=nome;
			nomeNovo=nome;
			velho=idade;
			novo=idade;
			if(idade>velho){
				velho=idade;
				nomeVelho=nome;
				}
			if(idade<novo){
				novo=idade;
				nomeNovo=nome;
			}
			i++;	
		}while(i<=3);
		System.out.println("o mais velho é"+nomeVelho+ "com"+velho+"anos e o mais novo é"+nomeNovo+"com"+novo+ "anos");
	
	}

}
