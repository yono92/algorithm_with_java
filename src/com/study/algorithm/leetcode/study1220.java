package com.study.algorithm.leetcode;

import java.util.Arrays;

public class study1220 {
    /*
    정수 배열로 표시 되는 큰 정수 가 주어집니다. digits 여기서 각각 digits[i]은 정수의 자릿수입니다.
    숫자는 왼쪽에서 오른쪽 순서로 가장 중요한 것부터 가장 중요하지 않은 것까지 정렬됩니다.
    큰 정수에는 선행 가 포함되지 않습니다
     */


        public int[] plusOne(int[] digits) {
            int c = 1;
            int n = digits.length -1;

            while (n >= 0 && c > 0) {
                digits[n] = (digits[n] + 1) % 10;
                c = (digits[n] == 0) ? 1 : 0;
                n--;
            }

            if (c > 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
            }
            return digits;
        }

    public static void main(String[] args) {
        int[] digits = new int[]{1, 2, 3};
        study1220 s = new study1220();
        System.out.println(Arrays.toString(s.plusOne(digits)));

    }
}
