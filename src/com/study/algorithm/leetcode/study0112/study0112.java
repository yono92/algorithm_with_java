package com.study.algorithm.leetcode.study0112;

import java.util.Arrays;

public class study0112 {
    /*
    nums 실행 길이 인코딩으로 압축된 목록을 나타내는 정수 목록이 제공 됩니다.
    요소의 인접한 각 쌍을 고려하십시오 [freq, val] = [nums[2*i], nums[2*i+1]] ( i >= 0). 이러한 각 쌍 에 대해 하위 목록에 연결된 freq 값을 가진 요소가 있습니다. val 압축 해제된 목록을 생성하기 위해 왼쪽에서 오른쪽으로 모든 하위 목록을 연결합니다.
    압축 해제된 목록을 반환합니다.
     */
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }
        int answer[] = new int[len];
        for (int i = 0 ,k=0; i < nums.length-1; i+=2) {
            for (int j = nums[i]; j > 0; j--) {
                answer[k] = nums[i + 1];
                k++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        study0112 s = new study0112();
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(s.decompressRLElist(nums)));

    }
}
