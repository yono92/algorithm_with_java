package com.study.algorithm.leetcode.study1222;

import java.util.Arrays;

public class study1222 {
    /*
    nums length 의 정수 배열이 주어지면 여기서 및 for ( 0-indexed ) 길이 n의 배열을 생성하려고 합니다.
    ans2nans[i] == nums[i]ans[i + n] == nums[i]0 <= i < n
    특히 두 배열 ans 의 연결 입니다.nums
    배열 을 반환 합니다 ans.
     */

    public int[] getConcatenation(int[] nums) {
        int[] answer = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = answer[nums.length+i] = nums[i];
        }
        return answer;
    }
    /*
    0부터 시작 하는 순열 nums ( 0-indexed )이 주어지면 where for each 와
    동일한 길이 의 배열 ans 을 만들고 반환합니다.ans[i] = nums[nums[i]]0 <= i < nums.length
    0부터 시작 하는 순열 은 에서 까지 ( 포함 )의 고유한 정수 nums 배열입니다 .0nums.length - 1
    */
    public int[] buildArray(int[] nums) {
        int[] answer = new int[nums.length];
        int numelem;
        for (int i = 0; i < nums.length; i++) {
            numelem = nums[i];
            answer[i] = nums[numelem];
        }
        return answer;
    }
    /*
    유효한 (IPv4) IP가 주어지면 address 해당 IP 주소의 변형된 버전을 반환합니다.
    Defanged IP 주소  는 모든 마침표 "."를 "[.]".
     */
    public String defangIPaddr(String address) {
        String answer;
        answer = address.replaceAll("\\.", "[.]");
        return answer;
    }
    public String defangIPaddr2(String address) {
        StringBuilder sb = new StringBuilder();
        int size = address.length();
        for (int i = 0; i < size; i++) {
            switch (address.charAt(i)) {
                case '.':
                    sb.append("[.]");
                    break;
                default:
                    sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1};
        int[] nums2 = new int[]{0, 2, 1, 5, 3, 4};
        String address= "1.1.1.1";
        study1222 s = new study1222();
        System.out.println(Arrays.toString(s.getConcatenation(nums)));
        System.out.println(Arrays.toString(s.buildArray(nums2)));
        System.out.println(s.defangIPaddr(address));
        System.out.println(s.defangIPaddr2(address));


    }
}
