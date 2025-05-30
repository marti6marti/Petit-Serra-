package ex7;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public static List<File> orderedByname(List<File> files) {
        return files.stream()
                .sorted(Comparator.comparing(File::getName))
                .toList();
    }

    public static List<File> orderedByLastModify(List<File> files) {
        return files.stream()
                .sorted(Comparator.comparing(File::lastModified).reversed())
                .toList();
    }

    public static List<File> orderedBySize(List<File> files) {
        return files.stream()
                .sorted(Comparator.comparing(File::length).reversed())
                .toList();
    }

    public static void mainMenu(Scanner sc) {
        boolean inMenu = true;
        System.out.println("Enter the directory route");
        String dirRoute = sc.nextLine();
        File dir = new File(dirRoute);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory path or the directory doesn't exist.");
            return;
        }

        while (inMenu) {
            System.out.println("=== What list order do you want? ===");
            System.out.println("=== 1. Ordered by name ===");
            System.out.println("=== 2. Ordered by last modified ===");
            System.out.println("=== 3. Ordered by size ===");
            System.out.println("=== 4. Close the program ===");
            int choice = sc.nextInt();
            sc.nextLine();
            File[] fileList = dir.listFiles();

            if (fileList == null || fileList.length == 0) {
                System.out.println("The directory is empty.");
                return;
            }

            List<File> files = Arrays.asList(fileList);
            switch (choice) {
                case 1:
                    for (File file : orderedByname(files)) {
                        System.out.println(file.getName());
                    }
                    break;

                case 2:
                    for (File file : orderedByLastModify(files)) {
                        System.out.println(file.getName());
                    }
                    break;

                case 3:
                    for (File file : orderedBySize(files)) {
                        System.out.println(file.getName());
                    }
                    break;

                case 4:
                    inMenu = false;
                    System.out.println("=== See you soon ===");
                    break;

                default:
                    System.out.println("Invalid choice, please select again.");
                    break;
            }
        }
    }
}
