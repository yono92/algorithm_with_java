package com.study.algorithm.programers.study0108;

public class study0108 {
    /*
    정수 n이 주어질 때, n 이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
     */
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
    /*
    정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
     */
    public int solution2(int num1, int num2) {
        double d1 = num1;
        double d2 = num2;
        double dnum = (d1 / d2) * 1000;
        int answer = (int) dnum;
        return answer;
    }

    /*
    정수 배열 numbers 가 매개변수로 주어집니다. numbers 의 원소의 평균값을 return 하도록 solution 함수를 완성해주세요.
     */
    public double solution3(int[] numbers) {
        double answer = 0;
        double d = 0;
        for (int i = 0; i < numbers.length; i++) {
            d += numbers[i];
        }
        answer = d / numbers.length;
        return answer;
    }

    /*
    머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
    머쓱이네 반 친구들의 키가 담긴 정수 배열 array 와 머쓱이의 키 height 가 매개변수로 주어질 때,
    머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution4(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) {
                answer++;
            }
        }
        return answer;
    }
    /*
    머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
    양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 정수 n과 k가 매개변수로 주어졌을 때,
    양꼬치 n 인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution5(int n, int k) {
        int answer = 0;
        int i = k - n / 10;
        answer = n * 12000 + i * 2000;
        return answer;
    }

    public static void main(String[] args) {
        study0108 s = new study0108();
        int n = 10;
        System.out.println(s.solution(n));
        int num1 = 3;
        int num2 = 2;
        System.out.println(s.solution2(num1, num2));
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(s.solution3(numbers));
        int[] array = new int[]{149, 180, 192, 170};
        int height = 167;
        System.out.println(s.solution4(array, height));
        int k = 3;
        System.out.println(s.solution5(n, k));

    }
}
