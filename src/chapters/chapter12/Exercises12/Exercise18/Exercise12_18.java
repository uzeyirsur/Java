
package chapters.chapter12.Exercises12.Exercise18;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_18 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_18 srcRootDirectory");
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
                        insertTheStatementOfPackage(files[i]);
                    }
                }
            }
        }

    }

    public static void insertTheStatementOfPackage(File file) throws IOException {
        String[] s1 = file.getParent().split("\\\\");
        String s = "";
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                s += "\n" + input.nextLine();
            }
            try (
                    PrintWriter output = new PrintWriter(file)
            ) {
                String firstLine = "package " + s1[s1.length - 1] + ";";
                s = firstLine + "\n" + s;
                output.println(s);
            }
        }
    }
}
