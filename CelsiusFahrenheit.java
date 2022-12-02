import java.util.*;
public class CelsiusFahrenheit { 
	public static void main (String args[]){
		Scanner in = new Scanner (System.in);
		double f,t,c;
		System.out.println("digite a temperatura em fahrenheit");
		f = in.nextDouble();
	    f = (c*18+32);
	    System.out.println("");
		  if(t<15) {
		  System.out.println(" Esta frio ");
		  }else if(t>15) {
		  System.out.println(" Esta ameno ");
		}else{
			  System.out.println(" calor");
		}
		
	}		

}
