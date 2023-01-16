package com.study.algorithm.leetcode.study0116;

public class study0116 {
    /*
    `정수가 지정되었습니다.n 토너먼트에서 이상한 규칙이 있는 팀의 수:
    현재 팀 수가 짝수일 경우 각 팀은 다른 팀과 짝을 이룬다.총계n / 2매치가 재생됩니다.n / 2다음 라운드에 진출합니다.
    현재 팀 수가 홀수일 경우 한 팀이 무작위로 토너먼트에 진출하고 나머지 팀은 짝이 된다.총계(n - 1) / 2매치가 재생됩니다.(n - 1) / 2 + 1다음 라운드에 진출합니다.
    우승자가 결정될 때까지 토너먼트에서 치른 경기 수를 반환합니다.
     */
    public int numberOfMatches(int n) {
        return n-1;
    }

    /*
    0-인덱스된 정수 배열이 제공됩니다.nums 그리고 양의 정수 diff 세쌍둥이(i, j, k)는 다음 조건이 충족될 경우 산술 삼중항이 됩니다.
    i < j < k,
    nums[j] - nums[i] == diff,그리고.
    nums[k] - nums[j] == diff.
    고유한 산술 세쌍둥이 수를 반환합니다.
     */
    public int arithmeticTriplets(int[] nums, int diff) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] - nums[i] == diff) {
                    for (int k = j+1; k < nums.length; k++) {
                        if (nums[k] - nums[j] == diff) {
                            cnt++;
                        }
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        study0116 s = new study0116();
        int n = 7;
        int[] nums = new int[]{0, 1, 4, 6, 7, 10};
        int diff = 3;
        System.out.println(s.numberOfMatches(n));
        System.out.println(s.arithmeticTriplets(nums, diff));
    }
}