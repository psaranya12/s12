package program;
import java.util.Scanner;
public class Mathpow {
public static void main(String[] args) {
		double a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the values");
		a=in.nextInt();
		b=in.nextInt();
		c=Math.pow(a,b);
System.out.println(c);
	}

}
