class Solution {
    public int solution(int[] arr1, int[] arr2) {
         // 길이가 다르면
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        }
        
        // 길이가 같으면
        int arr1_sum = 0;
        int arr2_sum = 0;
        
        for (int i : arr1){
            arr1_sum += i;
        }
        
        for (int i : arr2){
            arr2_sum += i;
        }
        
        if (arr1_sum == arr2_sum) return 0;
        return arr1_sum > arr2_sum ? 1 : -1;
    }
}
