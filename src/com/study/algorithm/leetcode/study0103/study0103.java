package com.study.algorithm.leetcode.study0103;

public class study0103 {
    /*
    Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
    양 의 정수가 주어지면 및 의 배수인 가장 작은 양의 정수 를 반환 n 합니다 . 2n
     */
    public int smallestEvenMultiple(int n) {
        return n%2==0? n: n*2;
    }
    public static void main(String[] args) {
        study0103 s = new study0103();
        int n = 5;
        System.out.println(s.smallestEvenMultiple(n));

    }

}
