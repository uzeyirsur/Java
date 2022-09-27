package weeks.week_04;

import java.util.Scanner;

public class FallingASleep {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Uykuya geçebilmek için bazı görevleri tamamlaman gerekiyor.");
		System.out.println("Lütfen aşağodaki soruları evet için 1  hayır için 0 diyerek cevaplayın:");

		int tuvalet = 0;
		int diş = 0;
		int su = 0;
		int odaSıcaklığı = 0;
		int tuvaletTekrar = 0;

		while (tuvalet + diş + su + odaSıcaklığı + tuvaletTekrar != 5) {
			System.out.println("\n\nTuvalete gittin mi ?");
			tuvalet = input.nextInt();
			System.out.println("Dişlerini fırçaladın mı ?");
			diş = input.nextInt();
			System.out.println("Suyunu içtin mi ?");
			su = input.nextInt();
			System.out.println("Uyumak için oda sıcaklığını uygun bir pozisyona (ne soğuk ne sıcak) getirdin mi?");
			odaSıcaklığı = input.nextInt();
			System.out.println("Tuvalete gitmiştin fakat bir süre geçti. Tuvaletin tekrar geldi mi ?");
			tuvaletTekrar = input.nextInt();
			if (tuvalet + diş + su + odaSıcaklığı + tuvaletTekrar == 5) {
				System.out.println("Artık uyuyabilirsin");
			} else {
				System.out.println("\n\nGörevleri tamamlamadın! Uyumak için görevleri tamamla.");
			}
		}
	}
}