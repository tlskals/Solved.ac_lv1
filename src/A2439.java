import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()); // BufferdReader는 String형식으로 받아오니 parseInt로 변환

        for (int k=1; k<=a; k++) {  // 입력된 수는 자연수이며, 항상 첫줄은 *이 찍히므로 1부터 시작해서 입력된 숫자 a까지 반복
            for (int i = 1; i <= a -k; i++) { // a가 5라면 첫줄의 공백은 4(a-k)개 별이 1(k++)개
                System.out.print(" "); // 공백을 출력함
            }
            for (int j = 1; j<=k; j++) { // 첫줄의 별의 개수는 1개부터 시작, 입력된 숫자만큼 별이 찍히니 j<=k
                System.out.print("*"); // 별을 출력함
            }
            System.out.println(); // 줄을 바꿔줌
        }
    }
}
