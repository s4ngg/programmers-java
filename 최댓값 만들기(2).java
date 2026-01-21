import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE; // Integer.MIN_VALUE로 최솟값으로 설정
        
        Arrays.sort(numbers);
        int num = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        answer = Math.max(num,num2); // Math.max로 최대값 비교
        return answer;
    }
}
