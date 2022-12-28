package com.study.algorithm.leetcode.study1228;

import java.util.Arrays;

public class study1228 {
    /*
    어레이 지정 nums, 각각에 대해서 nums[i] 배열 내의 몇 개의 숫자가 그보다 작은지 확인합니다
    즉, 각각에 대해 nums[i]당신은 유효한 수를 세어야 한다.j's그렇게 해서j != i 그리고. nums[j] < nums[i].
    답변을 배열로 반환합니다.
     */
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    cnt++;
                    answer[i] = cnt;
                } else {
                    answer[i] = cnt;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        study1228 s = new study1228();
        int[] nums = new int[]{8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(s.smallerNumbersThanCurrent(nums)));

    }
}
