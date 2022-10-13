package chapters.chapter07.Listings_07;

public class TheArrayClass {
    public static void main(String[] args) {
        char[] chars = {'a', 'A', '4', 'F', 'D', 'P'};
        char[] chars2 = {'a', 'A', '4', 'F', 'D', 'P'};
        char[] chars3 = {'a', 'A', '4', 'F', 'D', 'P'};
        java.util.Arrays.sort(chars, 1, 3);
        java.util.Arrays.sort(chars2);
        System.out.println(java.util.Arrays.toString(chars3) + "\n" + java.util.Arrays.toString(chars) + "\n" + java.util.Arrays.toString(chars2));
        System.out.println();
        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 7, 7, 10};
        java.util.Arrays.fill(list1, 5);
        java.util.Arrays.fill(list2, 1, 5, 8);
        System.out.println(java.util.Arrays.toString(list1)+ "\n" + java.util.Arrays.toString(list2));
    }
}
