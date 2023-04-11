package com.study.algorithm.programers.study0406;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class study0406 {
    class Answer {
        private int answer;

        public Answer(int answer) {
            this.answer = answer;
        }

        public int getAnswer() {
            return answer;
        }

        public void setAnswer(int answer) {
            this.answer = answer;
        }
    }

    public static String scoring(ArrayList<Answer> arr) {
        // 학생별 점수 생성
        int aScore = 0;
        int bScore = 0;
        int cScore = 0;
        for (int i = 0; i < arr.size(); i++) {
            int answer = arr.get(i).getAnswer();
            if (answer == 1) {
                if (i % 5 == 0) {
                    aScore++;
                }
            }

            if (answer == 3) {
                if (i % 5 == 0) {
                    cScore++;
                }
            }
            if (answer == 5) {
                if (i % 5 == 0) {
                    cScore++;
                }
            }
        }

        // 가장 높은 점수를 가진 수포자 찾기
        int maxScore = Math.max(Math.max(aScore, bScore), cScore);
        ArrayList<String> winners = new ArrayList<>();
        if (maxScore == aScore) {
            winners.add("a");
        }
        if (maxScore == bScore) {
            winners.add("b");
        }
        if (maxScore == cScore) {
            winners.add("c");
        }

        String result = String.join(", ", winners) + " : " + maxScore;
        return result;
    }

    public int solution2(int[] arr) {
        int answer = 0;
        int n = arr.length;

        // arr 배열에 중복된 원소가 있는지 확인
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                return -1; // 중복된 원소가 있으면 -1을 리턴
            }
            set.add(arr[i]);
        }

        // arr 배열의 길이가 3 미만이면 -1을 리턴
        if (n < 3) {
            return -1;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int lcm = lcm(arr[i], arr[j]);
                answer += lcm;
            }
        }

        return answer;
    }

    // 최대공약수를 구하는 메소드
    public int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수를 구하는 메소드
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        study0406 s = new study0406();
    }
}
