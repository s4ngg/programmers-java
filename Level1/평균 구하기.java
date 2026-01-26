class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
            // 처음엔 sum += arr[i]로 arr[i]번째의 값을 받을라 했다. 
            // ❌ 에러: i는 배열의 '값'이지 '인덱스'가 아님 
            // -> 배열에서 5가 나왔으면 sum += arr[5] 이기 때문에 존재하지 않은 인덱스 값을 가져옴으로 오류가 발생
            }
        return sum/arr.length;
    }
}
