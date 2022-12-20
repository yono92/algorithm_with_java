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
    /*
        감소하지 않는 순서로 정렬된 두 개의 정수 배열 nums1및 와 및 각각 의 요소 수를 나타내는 두 개의 정수 및 가 제공 됩니다.
        nums2 m n nums1 nums2
        감소하지 않는 순서로 정렬된 단일 배열로 nums1병합 합니다 .nums2
        최종 정렬된 배열은 함수에 의해 반환되지 않아야 하며 대신 배열 내부에 저장
        nums1 되어야 합니다 . 이를 수용하기 위해 nums1의 길이는 입니다 m + n. 여기서 첫 번째 m
        요소는 병합해야 하는 요소를 나타내고 마지막 n 요소는 로 설정되며 0무시해야 합니다. nums2의 길이를 가 n 집니다.
    */

        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int len = nums1.length -1;
            int idx1 = m - 1;
            int idx2 = n - 1;

            for (int i = len; i >= 0 && idx1 >=0 && idx2 >=0; i--) {
                if (nums1[idx1] >= nums2[idx2]) {
                    nums1[i] = nums1[idx1--];
                } else {
                    nums1[i] = nums2[idx2--];
                }
            }
            while (idx2 >= 0) {
                nums1[idx2] = nums2[idx2--];
            }

        }
    public static void main(String[] args) {
        int[] digits = new int[]{1, 2, 3};

        study1220 s = new study1220();
        System.out.println(Arrays.toString(s.plusOne(digits)));
    }
}

