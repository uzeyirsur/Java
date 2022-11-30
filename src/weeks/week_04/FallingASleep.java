
package weeks.week_04;

import java.util.Scanner;

public class FallingASleep {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Uykuya geçebilmek için bazı görevleri tamamlaman gerekiyor.");
		System.out.println("Lütfen aşağodaki soruları evet için 1  hayır için 0 diyerek cevaplayın:");

		int tuvalet = 0;
		int dis = 0;
		int su = 0;
		int odaSicakligi = 0;
		int suKontrol = 0;
		int tuvaletKontrol = 0;
		int odaSicakligiKonrol = 0;
		int sogukSicak = 0;

		while (tuvalet + dis + su + odaSicakligi != 4) {
			while (tuvalet != 1) {
				System.out.println("\nTuvalete girdin mi ?");
				tuvalet = input.nextInt();
				if (tuvalet == 0) {
					System.out.println("Tuvalete gir.");
				} else {
					System.out.println("Tamam diğer adıma geçelim.");
				}
			}
			while (dis != 1) {
				System.out.println("\nDişlerini fırçaladın mı ?");
				dis = input.nextInt();
				if (dis == 0) {
					System.out.println("Dişlerini fırçala !");
				}
			}
			while (su != 1) {
				System.out.println("Susuzluğun geçene kadar su içtin mi ??");
				su = input.nextInt();
				if (su == 0) {
					System.out.println("Su iç !");
				} else {
					System.out.println("Tamam diğer adıma geçebiliriz.");
				}
			}
			while (odaSicakligi != 1) {
				System.out.println("\nOda sıcaklığı yatarken ne üşüyeceğin ne de sıcaklayacağın seviyede mi ?");
				odaSicakligi = input.nextInt();
				if (odaSicakligi == 0) {
					System.out.println("Oda sıcak mı soğuk mu ? (Sıcak için 1'e, soğuk için 0'a basın.) ");
					sogukSicak = input.nextInt();
					if (sogukSicak == 1) {
						System.out.println("Öyleyse camı biraz daha aç !");
					} else {
						System.out.println("Öyleyse camı biraz daha kıs !");
					}
				}
			}
		}
		System.out.println("Evet tüm görevleri yaptın gibi görünüyor fakat...");
		while (suKontrol + tuvaletKontrol + odaSicakligiKonrol != 3) {
			while (suKontrol != 1) {
				System.out.println("\nHala susuz olmadığına emin misin ?");
				suKontrol = input.nextInt();
				if (suKontrol == 0) {
					System.out.println("Kalk ve susuzluğun geçene kadar su iç");
				} else {
					System.out.println("Tamam diğer adıma geçebiliriz.");
				}
			}
			while (tuvaletKontrol != 1) {
				System.out.println("\nBelli bir süre geçti, hala tuvaletin olmadığına emin misin?");
				tuvaletKontrol = input.nextInt();
				if (tuvaletKontrol == 0) {
					System.out.println("Tekrar tuvalete gir.");
				} else {
					System.out.println("Tamam diğer adıma geçebiliriz.");
				}
			}
			while (odaSicakligiKonrol != 1) {
				System.out.println("\nOda sıcaklığı yatarken ne üşüyeceğin ne de sıcaklayacağın seviyede mi ?");
				odaSicakligiKonrol = input.nextInt();
				if (odaSicakligiKonrol == 0) {
					System.out.println("Oda sıcak mı soğuk mu ? (Sıcak için 1'e, soğuk için 0'a basın.) ");
					sogukSicak = input.nextInt();
					if (sogukSicak == 1) {
						System.out.println("Öyleyse camı biraz daha aç !");
					} else {
						System.out.println("Öyleyse camı biraz daha kıs !");
					}
				}
			}
		}
		System.out.println("\nEvet tüm görevler tamamlandı artık uyuabilirsin.");
	}
}
