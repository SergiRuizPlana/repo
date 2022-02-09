package euler;
import java.util.Scanner;

public class Euler {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Euler pr = new Euler();
		String msg = "Entra els casos de prova a considerar:";
		int f = 0;
		int n = 0;
		double x = 0;
		f = pr.askN(msg);
		int[] array = new int[f+1];
		double[] array2 = new double[f+1];
		for (int i = 0; i < array.length - 1; i++) {
			String msg2 = "Entrada " + (i+1) + ": " ;
			array[i] = pr.askN(msg2);
		}
		
		for (int i=0; i<array.length - 1; i++) {
			x = pr.euler(array[i]);
			array2[i] = x;
		}
		
		pr.print(array2);
		
		System.out.println(pr.elevat(3,2));
		
	}
	
	public int askN(String msg) {
		int n = 0;
		System.out.println(msg);
		n = sc.nextInt();
		
		return n;
	}
	
	public double euler(int n) {
		double x = 0;
		
		x = elevat(n, (1 + 1 / n));
			
		return x;
	}
	
	public int elevat(int n, int base) {
		
		n = n - 1;
		
		if (n>0) {
		return base * elevat(n, base); 
		}else {
			return base;
		}
	}
	
	public void print(double[] array2) {
		
		for (int i=0; i<array2.length - 1; i++) {
			System.out.println(array2[i]);
		}
	}
	

}
