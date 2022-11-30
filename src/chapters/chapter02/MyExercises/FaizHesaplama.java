
package chapters.chapter02.MyExercises;

import java.util.Scanner;

public class FaizHesaplama {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Yıllık faiz oranını giriniz: (Ör. 4.5) ");
		double yillikFaizOrani = input.nextDouble();

		System.out.println("Kaç yılda ödemek istiyorsunuz: (Ör. 5 ");
		int yil = input.nextInt();
		
		System.out.println("Borç alınacak miktar:(Ör. 1567,98) ");
		double borcMiktari = input.nextDouble();
		
		double aylikFaizOrani = yillikFaizOrani / 1200;
		
		
	}

}
