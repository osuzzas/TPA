package salarioBruto;
import java.util.Scanner;
public class salarioBruto {
	public static void main (String[]args) {
		double sb, desconto;
		Scanner in = new Scanner (System.in);
				System.out.println ("Digite aqui o salário:");
				sb = in.nextDouble ();
				desconto = sb*6/100;
				System.out.println ("O desconto é:"+desconto);
				in.close();
	}

}
