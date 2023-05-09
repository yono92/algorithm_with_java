package com.study.algorithm.baekjoon;

import java.util.Arrays;

public class study0508 {

    int solution(double flo) {
        int answer = (int) flo;
        return answer;
    }
    public String solution2(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }

    public int solution3(int num, int n) {
        int answer = 0;
        if (num % n == 0) {
             answer = 1;
        }
        return answer;
    }

    public int[] solution4(int[] arr, int k) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (k % 2 != 0) {
                answer[i] = arr[i] * k;
            } else {
                answer[i] = arr[i] + k;
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        study0508 s = new study0508();
        s.solution(1.42);
        int[] arr = new int[]{1, 2, 3, 100, 99, 98};
        System.out.println(s.solution(1.42));
        System.out.println(s.solution2("string" , 3));
        System.out.println(s.solution3(94, 2));
        System.out.println(Arrays.toString(s.solution4(arr, 3)));
    }
}
