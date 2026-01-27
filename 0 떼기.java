class Solution {
    public String solution(String n_str) {
        int num = Integer.parseInt(n_str);
        String answer = String.valueOf(num);
        // 처음에 while문으로 풀었다가 실패
        // parseInt를 사용하면 앞의 0들이 자동으로 제거
        return answer;
    }
}
