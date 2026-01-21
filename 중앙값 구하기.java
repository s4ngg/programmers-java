import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // java는 array.sort()가 아닌 Arrays.sort(배열명)을 사용
        return array [array.length/2];
    }
}
