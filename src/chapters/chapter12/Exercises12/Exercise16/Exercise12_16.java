package chapters.chapter12.Exercises12.Exercise16;

import com.sun.scenario.effect.impl.prism.PrTexture;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_16 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_16 file oldString newString");
            return;
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File does not exists");
            return;
        }

        String s1 = "";
        StringBuilder s2 = new StringBuilder();
        try (
                Scanner input = new Scanner(file);
                PrintWriter output = new PrintWriter(file)
        ) {
            while (input.hasNext()) {
                s1 = input.nextLine() +"\n";
              s2.append(s1.replaceAll(args[1], args[2]));
            }
            output.print(s2);


        }
    }
}
