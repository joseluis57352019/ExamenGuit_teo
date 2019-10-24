import java.util.Scanner;

public class P236 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int g, m, c;
		int sum = 0;
		int sum2 = 0;
		
		do {
			g = sc.nextInt();
			m = sc.nextInt();
			c = sc.nextInt();
			sum = g;
			
			for (int i = 0; i < c; i++) {
				sum *= m;
				sum2+=sum;
			}
			
			System.out.println(sum2);
			
		} while (g!=0);

	}

}
