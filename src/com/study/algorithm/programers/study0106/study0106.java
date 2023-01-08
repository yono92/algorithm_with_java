package com.study.algorithm.programers.study0106;

public class study0106 {
    /*
    머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
    조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
    문자열 배열 babbling 이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            String tempbabbling = babbling[i];
            String[] temp = tempbabbling.split("aya|ye|woo|ma");
            if (temp.length == 0) {
                answer++;
            }
        }

        return answer;
    }
    /*
    등차수열 혹은 등비수열 common 이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
     */
    public int solution7(int[] common) {
        int answer = 0;
        if(common[2]-common[1] == common[1]-common[0])
            return common[common.length-1] + common[2] - common[1];
        else
            return common[common.length-1] * (common[2]/common[1]);
    }
    /*
    정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun 하도록 solution 함수를 완성해주세요.
     */
    public int solution2(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        } else {
            return -1;
        }
    }
    /*
    정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution3(int num1, int num2) {
        return num1 / num2;
    }
    /*
    머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age 가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
     */
    public int solution4(int age) {
        return 2023 - age  ;
    }
    /*
    각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
     각 angle 이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return 하도록 solution 함수를 완성해주세요.
     */
    public int solution5(int angle) {
        if (angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle < 180) {
            return 3;
        } else {
            return 4;
        }
    }
    /*
    정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
     */
    public int solution6(int num1, int num2) {
        return (num1 / num2) + num1 % num2 * 1000;
    }
    public static void main(String[] args) {
        study0106 s = new study0106();
        String[] babbling = new String[]{"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(s.solution(babbling));
        int angle = 70;
        int num1 = 3;
        int num2 = 2;
        int[] common = new int[]{1, 2, 3, 4};
        System.out.println(s.solution7(common));
    }
}
