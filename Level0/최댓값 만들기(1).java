class Solution {
    public int solution(int[] numbers) {
        int max = numbers[0]; // [-5, 1, 3]이런식이면 오류나서 0으로 초기화.
        int sec = 0;
        
        for (int i = 1; i < numbers.length; i++) // 배열은 length고 문자열은 괄호 o
        {
            if (numbers[i] > max)
            { 
                sec = max;
                max = numbers[i];
            } else if (numbers[i] > sec)
            {
                sec = numbers[i];
            }
        }
        
        return max * sec;
    }
}
