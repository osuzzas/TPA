package Classicos;
import java.util.*;
public class Tabuada {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int i, n, r;
		for (i=1; i<=10; i++) {
			for (n=1; n<=10; n++) {
				r = i * n;
				System.out.println(i+" x "+n+" = "+r);
			}
			System.out.println();
		}
	}
}
