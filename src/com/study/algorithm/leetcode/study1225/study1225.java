package com.study.algorithm.leetcode.study1225;

public class study1225 {
    /*
    양의 정수 지정n, 양쪽의 배수인 최소 양의 정수를 반환합니다.2그리고.n.
     */
    public int smallestEvenMultiple(int n) {
            if (n % 2 == 0) {
                return n;
            } else {
                return n * 2;
            }

    }


    public static void main(String[] args) {
        int n = 5;
        int n2 = 6;
        study1225 s = new study1225();
        System.out.println(s.smallestEvenMultiple(n));
        System.out.println(s.smallestEvenMultiple(n2));
    }
}
