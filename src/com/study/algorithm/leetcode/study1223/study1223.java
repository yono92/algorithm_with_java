package com.study.algorithm.leetcode.study1223;

import java.util.Arrays;

public class study1223 {
    /*
    형식의 요소 nums로 구성된 배열이 주어 집니다.2n[x1,x2,...,xn,y1,y2,...,yn]
    형식으로 배열을 반환합니다 .[x1,y1,x2,y2,...,xn,yn]
     */
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[nums.length];
        int k = 0, j = n;
        for(int i= 0;i < n; i++) {
            answer[k++] = nums[i];
            answer[k++] = nums[j++];

        }

        return answer;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int n = 3;

        study1223 s = new study1223();
        System.out.println(Arrays.toString(s.shuffle(nums, n)));

    }
}
