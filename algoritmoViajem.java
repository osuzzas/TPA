package listaDois;
import java.util.*;
public class algoritmoViajem {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double lugar, valor, dia;
		System.out.println("Dgite 0 caso v� para Ilhabela, ou digite 1 caso v� para Fernando de Noronha");
		lugar=in.nextDouble();
		if (lugar==0) {
			System.out.println("Digite a quantidade de dias");
			dia=in.nextDouble();
			if (dia<=5) {
				valor=dia*240;
				System.out.println("O valor ser�"+valor);
			}else if(dia<=10) {
				valor=dia*220+130;
				System.out.println("O valor ser�"+valor);
			}else {
				valor=dia*210+150;
				System.out.println("o valor ser�"+valor);
			}
		}else if (lugar==1){
			System.out.println("Digite a quantidade de dias");
			dia=in.nextDouble();
			if (dia<=5) {
				valor=dia*400+100;
				System.out.println("O valor ser�"+valor);
			}else if (dia<=10) {
				valor=dia*410+150;
				System.out.println("o valor ser�"+valor);
			}else {
				valor=dia*420+200;
				System.out.println("o valor ser�"+valor);
			}
			in.close();
		}
	}
}
