class Solution {
    public int solution(int price) {
        int answer = 0;
        if (price >= 500000) { // 큰 수부터 작성해야 && 작성 안해도 됨.
            answer = (int)(price * 0.8); // 0.8이 소수이기때문에 (int)()로 형변환
        } else if (price >= 300000) {
            answer = (int)(price * 0.9);
        } else if (price >= 100000) {
            answer = (int)(price * 0.95);
        } else{
            answer = price;
        }
        return answer;
    }
}
