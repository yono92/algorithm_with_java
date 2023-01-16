public class study0116 {
    /*
    `정수가 지정되었습니다.n토너먼트에서 이상한 규칙이 있는 팀의 수:
    현재 팀 수가 짝수일 경우 각 팀은 다른 팀과 짝을 이룬다.총계n / 2매치가 재생됩니다.n / 2다음 라운드에 진출합니다.
    현재 팀 수가 홀수일 경우 한 팀이 무작위로 토너먼트에 진출하고 나머지 팀은 짝이 된다.총계(n - 1) / 2매치가 재생됩니다.(n - 1) / 2 + 1다음 라운드에 진출합니다.
    우승자가 결정될 때까지 토너먼트에서 치른 경기 수를 반환합니다.
     */
    public int numberOfMatches(int n) {
        return n-1;
    }
    public static void main(String[] args) {
        study0116 s = new study0116();
        int n = 7;
    }
}