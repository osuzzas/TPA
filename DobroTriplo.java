import java.util.Scanner;
public class DobroTriplo {
	public static void main (String[]args) {
		double v, dv,tv;
		Scanner in= new Scanner (System.in);
		System.out.println("Digite o valor");
		v=in.nextDouble();
		dv=v*2;
		tv=v*3;
		System.out.println("O dobro do valor é"+dv);
		System.out.println("O triplo do valor é"+tv);
		in.close();
		
	}
	

}
