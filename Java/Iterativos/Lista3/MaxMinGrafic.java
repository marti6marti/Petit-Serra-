package Lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxMinGrafic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listNumbers = new ArrayList<>();
        int numberInput;
        while ((numberInput = input.nextInt()) != -1) {
            listNumbers.add(numberInput);
        }

        int minCount = 0;
        int maxCount = 0;
        Integer minRelativo = null;
        Integer maxRelativo = null;

        for (int i = 1; i < listNumbers.size() - 1; i++) {
            int prev = listNumbers.get(i - 1);
            int curr = listNumbers.get(i);
            int next = listNumbers.get(i + 1);

            if (curr < prev && curr < next) {
                minCount++;
                if (minRelativo == null || curr < minRelativo) {
                    minRelativo = curr;
                }
            }
            if (curr > prev && curr > next) {
                maxCount++;
                if (maxRelativo == null || curr > maxRelativo) {
                    maxRelativo = curr;
                }
            }
        }

        System.out.println(minCount);
        System.out.println(maxCount);

        if (minRelativo != null) {
            System.out.println(minRelativo);
        }
        if (maxRelativo != null) {
            System.out.println(maxRelativo);
        }
    }
}
