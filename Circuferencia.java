import java.util.Scanner;
public class Circuferencia {
	public static void main (String[]args) {
		double a, r;
		Scanner in=new Scanner (System.in);
		System.out.println("Digite o valor do raio:");
		r=in.nextDouble();
		a=3.14*r*r;
		System.out.println("A área é:"+a);
		in.close();
		
			
	}

}
