
package chapters.chapter07.Listings_07;

public class FirstArrays {
    public static void main(String[] args) {
        int[] sayiDizisi;
        sayiDizisi = new int[16];
        sayiDizisi[0] = 1;
        sayiDizisi[1] = 2;
        sayiDizisi[2] = 1;
        sayiDizisi[3] = 2;
        sayiDizisi[4] = 1;
        sayiDizisi[5] = 2;
        sayiDizisi[6] = 1;
        sayiDizisi[7] = 2;
        sayiDizisi[8] = 1;
        sayiDizisi[9] = 2;
        sayiDizisi[10] = 1;
        sayiDizisi[11] = 2;
        sayiDizisi[12] = 1;
        sayiDizisi[13] = 2;
        sayiDizisi[14] = 1;
        sayiDizisi[15] = 2;

        for (int i = 0; i < sayiDizisi.length; i++){
            System.out.println(sayiDizisi[i]);
        }

        double [] myList ={1,2,3,4};
        for(int i = 0; i< myList.length; i++){
            System.out.println(myList[i]);
        }
        char[] city = {'D', 'a', 'l', 'l','a', 's'};
        System.out.println(city);

    }
}
