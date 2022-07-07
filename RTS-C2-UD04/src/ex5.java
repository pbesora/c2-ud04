
public class ex5 {

	public static void main(String[] args) {
		int a=6, b=10, c=2, d=3, cambio;
		
		System.out.print(" A = " + a);
		System.out.print(" B = " + b);
		System.out.print(" C = " + c);
		System.out.print(" D = " + d + "\n");

		cambio=b;
		b=c;
		c=a;
		a=d;
		d=cambio;
		
		System.out.print(" A = " + a);
		System.out.print(" B = " + b);
		System.out.print(" C = " + c);
		System.out.print(" D = " + d);
	}

}
