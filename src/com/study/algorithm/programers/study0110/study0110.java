package com.study.algorithm.programers.study0110;

import java.util.Arrays;

public class study0110 {
    /*
    연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다.
    두 정수 num 과 total 이 주어집니다.
    연속된 수 num 개를 더한 값이 total 이 될 때, 정수 배열을 오름차순으로 담아
    return 하도록 solution 함수를 완성해보세요.
     */
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int nSum = num * (1 + num) / 2;
        int start = (total - nSum) / num;

        for (int i = 1; i < num + 1; i++) {
            answer[i - 1] = i + start;
        }
        return answer;
    }
    public static void main(String[] args) {
        study0110 s = new study0110();
        int num = 3;
        int total = 12;
        System.out.println(Arrays.toString(s.solution(num, total)));

    }
}
