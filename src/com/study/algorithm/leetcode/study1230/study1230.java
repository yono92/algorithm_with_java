package com.study.algorithm.leetcode.study1230;

public class study1230 {
    /*
    문자열이 주어집니다.s및 정수 배열 indicess에서의 캐릭터가 섞일 것이다
    .i th 위치가 로 이동하다 indices[i]현악기 안에서.
    셔플된 스트링을 되돌립니다.
     */
    public String restoreString(String s, int[] indices) {

        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++){
            sb.setCharAt(indices[i], s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        study1230 s = new study1230();


    }
}
