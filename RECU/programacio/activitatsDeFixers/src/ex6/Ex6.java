package ex6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {


        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Type the directory route");
            String dirRoute = sc.nextLine();

            File dir = new File(dirRoute);

            if (dir.exists() && dir.isDirectory() && dir.list() != null) {
                for (String str : dir.list()) {
                    File tempFile = new File(dir, str);
                    try {
                        if (tempFile.isDirectory()) {
                            File newTxt = new File(dir, tempFile.getName() + "txt");
                            newTxt.createNewFile();
                        } else if (tempFile.isFile() && tempFile.getName().endsWith(".txt")) {
                            String newName = tempFile.getName().substring(0, tempFile.getName().length() - 4);
                            File newDir = new File(dir, newName);
                            newDir.mkdir();
                        }
                    } catch (IOException e) {
                        System.out.println("An error occurred while processing the file: " + tempFile.getName() + " - " + e.getMessage());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }


    }
}
