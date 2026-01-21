class Solution {
    public int solution(int[] box, int n) {
        int answer = 1; // * 사용이라 1로 스타트해야함
        for (int i=0; i<3; i++) {
            answer *= box[i] / n;
        }
        return answer;
    }
}
