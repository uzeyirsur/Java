package chapters.chapter07.Listings_07;

public class Listing_07_07 {
    public static void main(String[] args) {
        int[] list = new int[100000];
        for (int i = 0; i < list.length; i++) {
            list[i] = i+2;
        }
        int element = binarySearch(list, 555);
        System.out.println(element);
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -low - 1;
    }
}
