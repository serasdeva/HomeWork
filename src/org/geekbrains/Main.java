package org.geekbrains;

import lesson1.TaskOne;
import lesson1.TaskTwo;
import lesson1.TaskThree;
import lesson1.TaskFour;
import lesson1.TaskFive;


public class Main {


    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[] {2,5,6};
        int n = 3;
        TaskOne.merge(nums1, 3, nums2, 3);

        int[] nums = new int[] {0,2,1,5,3,4};
        TaskTwo.buildArray(nums);

        int[] numsForTaskThree = new int[] {3,2,2,3};
        int val = 3;
        TaskThree.removeElement(numsForTaskThree, val);

        TaskFour.reverseWords("the sky is blue"); // Не смог доделать, проблема с пробелами

        TaskFive.isPalindrome("A man, a plan, a canal: Panama");
    }
}
