import java.util.Scanner;

public class MükemmelSayı {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bir Sayı Giriniz : ");
		int n = sc.nextInt();
		
		int total = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				total += i;
			}
			
		}
		
		if (total == n) {
			System.out.println(n + " Sayısı Mükemmel Bir Sayıdır.");			
		}else  {
			System.out.println(n + " Sayısı Mükemmel Bir Sayı Değildir.");
		}

	}

}
