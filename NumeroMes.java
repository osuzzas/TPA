package placaVeiculo;
import java.util.*;
public class NumeroMes {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int nM;
		System.out.println("Escreva o número do mês de 1 a 12");
		nM = in.nextInt();
		switch (nM) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("Esse mês possui 31 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("Esse mês possui 30 dias");
			break;
		default: System.out.println("Esse mês possui 28 dias");
		}
		in.close();
	}
}
