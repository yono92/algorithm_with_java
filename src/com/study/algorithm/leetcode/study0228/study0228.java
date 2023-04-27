package com.study.algorithm.leetcode.study0228;

import java.util.Arrays;
import java.util.HashMap;

public class study0228 {
    /*
    문자열 배열이 지정되었습니다.names, 및 어레이 heights다른 양의 정수로 구성되어 있습니다.두 어레이 모두 길이입니다.n.
    각 인덱스에 대해i,names[i]그리고.heights[i]의 이름과 높이를 나타냅니다.ith사람인.
    돌아가다 names 사람들의 높이에 따라 내림차순으로 정렬되어 있다.
     */
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> resultMap = new HashMap<Integer, String>();

        for (int i = 0; i < names.length; i++) {
            resultMap.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] answer = new String[heights.length];
        int idx = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            answer[idx] = resultMap.get(heights[i]);
            idx++;
        }
        
        return answer;
    }


    public static void main(String[] args) {
        study0228 s = new study0228();
        String[] names = new String[]{"Mary", "John", "Emma"};
        int[] heights = new int[]{180, 165, 170};
        System.out.println(Arrays.toString(s.sortPeople(names, heights)));
    }
}
