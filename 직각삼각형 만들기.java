import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i=1; i<=n; i++) {        // 줄 반복 (1~n줄)
            for (int j=0; j<i; j++) {     // 각 줄에 별 i개 출력
                System.out.printf("*");
            } 
            System.out.printf("\n");      // 줄바꿈
        }
    }
}
