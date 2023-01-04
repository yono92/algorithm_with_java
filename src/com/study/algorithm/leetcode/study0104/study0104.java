package com.study.algorithm.leetcode.study0104;

public class study0104 {
    /*
    Given an integer number n, return the difference between the product of its digits and the sum of its digits.
     */
    public int subtractProductAndSum(int n) {
        String temp = Integer.toString(n);
        int[] digits = new int[temp.length()];
        int sum = 0;
        int multiple = 1;
        for (int i = 0; i < temp.length(); i++) {
            digits[i] = temp.charAt(i) - '0';
            sum += digits[i];
            multiple *= digits[i];
        }

        return multiple - sum;
        // best
//        int ans1 = 1;
//        int ans2 = 0;
//        while(n != 0){
//            int digit = n%10;  //use modulo operator to get the digits
//            n = n/10; //decrement the number by 10.
//            ans1 = ans1*digit;
//            ans2 = ans2 + digit;
//        }
//        return ans1 - ans2;
    }
    public static void main(String[] args) {
        study0104 s = new study0104();
        int n = 234;
        System.out.println(s.subtractProductAndSum(n));
    }
}
