package excApostila;
import java.util.*;
public class exercicioFatorial {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int f=1, n1, n2, i;
		System.out.println("Escreva o nÃºmero");
		n1=in.nextInt();
		n2=(n1*1)-1;
		i=n1*1;
		 do {
			f=n1*n2;
			n1=f*1;
			n2=n2-1;
			i=i-1;	
		}
		 while(i>1);
			 System.out.println("O número final é:"+f);
		in.close();
	}
}
