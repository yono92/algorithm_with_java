package com.study.algorithm.leetcode.study1221;

import java.util.Arrays;

public class study1221 {
    /*
    지정된 배열 nums 어레이의 실행 합계를 다음과 같이 정의합니다.runningSum[i] = sum(nums[0]…nums[i]).
    의 실행 합계를 반환한다.nums.
     */
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] answer = new int[len];
        int sum = 0;

        for (int i = 0; i < len; i++) {
            sum += nums[i];
            answer[i] = sum;
        }
        return answer;
    }

    public double[] convertTemperature(double celsius) {
        double Kelvin =celsius + 273.15;
        double Fahrenheit =  celsius  * 1.80 + 32.00;
        double[] answer =new double[2];

        answer[0] = Kelvin;
        answer[1] = Fahrenheit;
        return answer;
    }

    /*
    소수점 두 자리로 반올림된 음수가 아닌 부동 소수점 숫자가 주어집니다.celsius 온도(섭씨)를 나타냅니다.
    섭씨도를 켈빈과 화씨로 변환하여 배열로 반환해야 합니다.ans = [kelvin, fahrenheit].
    어레이를 되돌립니다. 회답 범위10-5정답을 맞힐 수 있습니다.
     */
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4};
        double celsius = 36.50;
        study1221 s = new study1221();
        System.out.println(Arrays.toString(s.runningSum(nums)));
        System.out.println(Arrays.toString(s.convertTemperature(celsius)));
    }
}
