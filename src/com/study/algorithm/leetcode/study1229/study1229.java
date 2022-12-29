package com.study.algorithm.leetcode.study1229;

public class study1229 {
    /*
    회사들
    조건부여가 있습니다.jewels 보석인 돌의 종류를 나타내고 있습니다.
    stones 가지고 있는 돌을 상징합니다.의 각 문자 stones 가지고 있는 돌의 일종입니다.보석도 몇 개 가지고 있는지 알고 싶어합니다.
    글자는 대소문자를 구분하기 때문에"a"와는 다른 종류의 돌로 여겨진다."A".
     */

    public int numJewelsInStones(String jewels, String stones) {
        int cnt = 0;
        char[] arr = new char[stones.length()];
        char[] arr2 = new char[jewels.length()];
        for (int i = 0; i < stones.length(); i++) {
            arr[i] = (stones.charAt(i));
            for (int j = 0; j < jewels.length(); j++) {
                arr2[j] =(jewels.charAt(j));
                if (arr[i] == arr2[j]) {
                    cnt++;
                }
            }
        }


        return cnt;
    }
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        study1229 s = new study1229();
        System.out.println(s.numJewelsInStones(jewels, stones));
    }
}
