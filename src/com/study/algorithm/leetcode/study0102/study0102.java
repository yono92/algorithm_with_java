package com.study.algorithm.leetcode.study0102;

import java.util.Arrays;

public class study0102 {
    /*
    음수가 아닌 정수 로 구성된 숨겨진 정수 배열 arr 이 있습니다 .n
    encoded 길이 n - 1가 다른 정수 배열로 인코딩되었습니다 encoded[i] = arr[i] XOR arr[i + 1]. 예를 들어, arr = [1,0,2,1]이면 encoded = [1,2,3].
    encoded 배열 이 제공 됩니다. first 의 첫 번째 요소인 arr 정수 도 제공 arr[0]됩니다.
    원래 배열 을 반환 합니다 arr. 답이 존재하고 고유하다는 것을 증명할 수 있습니다.
     */
    public int[] decode(int[] encoded, int first) {
        int[] answer = new int[encoded.length + 1];
        answer[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            answer[i + 1] = encoded[i] ^ answer[i];
        }
        return answer;
    }
    /*
    정확히 네 자리 숫자로 구성된 양 의 정수 가 제공 됩니다. 에 있는 숫자 를 사용하여 두 개의 새로운 정수로 분할 num 합니다 .
    및 에는 선행 0 이 허용되며 에서 찾은 모든 숫자를 사용해야 합니다.num new1 new2 num new1 new2 num
    예를 들어, 가 주어졌다면 num = 2932다음과 같은 숫자가 있습니다: two 2's, one 9and one 3. 가능한 쌍 중 일부 는 [new1, new2], [22, 93]및 [23, 92]입니다 .[223, 9][2, 329]
    및 의 가능한 최소 합계를 반환 합니다 .new1new2
     */

    public int minimumSum(int num) {
        char[] ch = (num + "").toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
        int n = Integer.parseInt("" + ch[0] + ch[2]);
        int m = Integer.parseInt("" + ch[1] + ch[3]);
        return n + m;
    }
    public static void main(String[] args) {
        study0102 s = new study0102();
        int[] encoded=new int[]{1, 2, 3};
        int first = 1;
        int num = 2932;
        System.out.println(Arrays.toString(s.decode(encoded, first)));
        System.out.println(s.minimumSum(num));

    }
}
