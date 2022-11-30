package chapters.chapter12.Exercises12.Exercise20;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_20 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_20 srcRootDirectory");
            System.exit(1);
        }
        File dir = new File(args[0]);
        if (!dir.exists()) {
            System.out.println(dir.getName() + " does not exists");
            System.exit(2);
        }
        if (!dir.isDirectory()) {
            System.out.println(dir.getName() + " is not a directory");
            System.exit(3);
        }
        ArrayList<File> directories = new ArrayList<>();
        directories.add(dir);
        while (!directories.isEmpty()) {
            File file = directories.remove(0);
            if (file.isDirectory()) {
                File[] files = file.listFiles();

                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        directories.add(files[i]);
                    }
                    if (files[i].isFile() && files[i].getName().endsWith(".java")) {
                        removeStatementOfPackage(files[i]);
                    }
                }

            }

        }
    }

    public static void removeStatementOfPackage(File file) throws Exception {
        StringBuilder s2 = new StringBuilder();
        int i = 0;
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                String s = input.nextLine();
                if (i == 0) {
                    s2.append(s.replace(s, ""));
                    i++;
                } else {
                    s2.append(s + "\n");
                }


            }
            PrintWriter output = new PrintWriter(file);
            output.print(s2);
            output.close();
        }
    }
}
