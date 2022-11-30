package chapters.chapter12.Exercises12.Exercise32;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_32 {
    public static void main(String[] args) throws Exception {

        PrintWriter output = new PrintWriter("Rank5");
        output.println("Year\tRank1\tRank2\tRank3\tRank4\tRank5\tRank1\tRank2\tRank3\tRank4\tRank5");

        ArrayList<String> maleName = new ArrayList<>();
        ArrayList<String> femaleName = new ArrayList<>();

        Scanner input = null;
        for (int year = 2004; year >= 2001; year--) {
            File file = new File("C:\\Users\\omers\\OneDrive\\Masaüstü\\babynameranking" + year + ".txt");
            int rank = 0;

            input = new Scanner(file);
            output.print(year + "\t");

            while (rank < 5) {
                rank = input.nextInt();
                maleName.add(input.next());
                femaleName.add(input.next());
            }
            for (int i = 0; i < 5; i++) {
                output.print(femaleName.get(0) + "\t");
                femaleName.remove(0);
            }

            for (int i = 0; i < 5; i++) {
                output.print(maleName.get(0) + "\t");
                maleName.remove(0);
            }
            output.println();
        }
        input.close();
        output.close();
    }
}
