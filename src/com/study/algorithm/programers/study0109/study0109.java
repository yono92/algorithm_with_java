package com.study.algorithm.programers.study0109;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class study0109 {
    /*
    정수가 담긴 리스트 num_ list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     */
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                odd++;
            } else {
                even++;
            }
        }
        answer[0] = odd;
        answer[1] = even;
        return answer;
    }
    /*
    정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
     */
    public int[] solution2(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
    /*
    정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution3(int[] array, int n) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                answer++;
            }
        }
        return answer;
    }
    public int[] solution4(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i = 0; i< num_list.length; i++){
            answer[i] = num_list[num_list.length -i -1];
        }

        return answer;
    }

    public static void main(String[] args) {
        study0109 s = new study0109();
        int[] num_list = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(s.solution(num_list)));
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(s.solution2(numbers)));
        int[] array = new int[]{1, 1, 2, 3, 4, 5};
        int n = 1;
        System.out.println(s.solution3(array, n));
        System.out.println(s.solution4(num_list));

    }
}
