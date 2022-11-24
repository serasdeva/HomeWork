package org.geekbrains;

import lesson1.TaskThree;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        Scanner num = new Scanner(System.in);
        System.out.print("Input a number: ");
        int val = num.nextInt();

        nums = removeElement(nums, val);

        System.out.println(Arrays.toString(nums));

    }
}
