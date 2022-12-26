package com.study.algorithm.leetcode.study1226;

public class study1226 {
    /*
    4개의 연산과 1개의 변수만 있는 프로그래밍 언어가 있습니다.X:
    ++X 그리고 .X++ 변수 값을 증가시킵니다.X타고1.
    --X 그리고 .X-- 변수 값을 감소시킵니다.X타고1.
    처음에 가치의 가치는 X이0.
    문자열 배열 지정 operations 작업 목록을 포함, 최종 값을 반환합니다.X 모든 작업을 수행한 후.
     */
    public int finalValueAfterOperations(String[] operations) {
        // Initially int x
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            String cal = operations[i];
            switch (cal) {
                case "++X":
                case "X++" : x += 1;
                break;
                case "--X" :
                case "X--" : x -= 1;
                break;
                default: x = 0;
                break;
            }
        }
        return x;
    }
    /*
    주어진 정수 배열 nums, 양호한 쌍의 수를 반환합니다.
    한 쌍(i, j)의 경우 good 라고 불립니다.nums[i] == nums[j]  그리고. i<j.
     */
    public int numIdenticalPairs(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        study1226 s = new study1226();
        String[] operations = new String[]{"X++","++X","--X","X--"};
        int[] nums = new int[]{1, 2, 3, 1, 1, 3};
        System.out.println(s.finalValueAfterOperations(operations));
        System.out.println(s.numIdenticalPairs(nums));

    }
}
