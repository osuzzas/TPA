package dozeEx;
import java.util.*;
public class prestacao {
	public static void main (String arg[]) {
		Scanner in=new Scanner (System.in);
		double compra, prestacao, total; 
		System.out.println("Digite o valor da compra:");
		compra=in.nextDouble();
		System.out.println("Digite o número de prestações:");
		prestacao=in.nextDouble();
		total=compra/prestacao;
		System.out.println("O valor final é:"+total);
		in.close();
	}
}
