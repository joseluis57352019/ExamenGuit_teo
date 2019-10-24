import java.util.Scanner;

public class P236 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long g, m, c, sum;
		
		do {
			g = sc.nextInt();
			m = sc.nextInt();
			c = sc.nextInt();
			sum = 0;
			if (g == 0 && m == 0 && c == 0) break;
			for (int i = 0; i < c; i++) {
				sum += g;
				g *=m;
			}
			
			System.out.println(sum);
			
		} while (g!=0);

	}

}
