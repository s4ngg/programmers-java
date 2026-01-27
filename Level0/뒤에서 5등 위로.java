import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        
        Arrays.sort(num_list); 
        // return num_list[4:]; 자바엔 슬라이싱 기능이 없어서 오류 발생
        return Arrays.copyOfRange(num_list, 5, num_list.length);
        // Arrays.copyOfRange(배열, 시작인덱스, 종료인덱스)
    }
}
