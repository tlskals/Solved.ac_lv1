import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //string

        int[] num = new int[9]; // 입력받을 숫자가 9개로 고정이므로 크기가 9인 배열 생성
        for (int i = 0; i < 9; i++) {
            num[i] = Integer.parseInt(br.readLine()); // 배열에 입력받는 숫자를 넣기때문에 0번부터 배열크기-1인 8까지 반복문으로 요소 삽입
        }
        int max = 0; //최대값을 넣어줄 변수 선언
        int count = 0; // 몇번째에 입력되어 있는지 세어줄 변수 선언

        for (int j = 1; j < 9; j++) { // 배열을 순회할 반복문 선언 0~8
            if (num[j] > max) { // 배열의 0번째 요소부터 8번째 요소까지 돌아가면서 max값과 비교하면서 배열의 요소가 max값보다 크면
                max = num[j]; // 해당 배열의 요소를 max값으로 교체
                count = j+1; // count 값은 해당 배열의 번호+1로 교체 (배열은 0번부터 시작이니 +1을 해주는것)
            }
        }
        System.out.println(max); // 최대값 출력
        System.out.println(count); // 몇번째 줄 인지 출력
    }
}

