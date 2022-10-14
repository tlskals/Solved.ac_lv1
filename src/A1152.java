import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class A1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine(); // 문자열을 입력받음
        str = str.trim(); // 받은 문자열에서 양쪽 공백 삭제 (입력 부분에 문자열은 공백으로 시작하거나 끝날 수 있다 때문에 삽입)

        String [] arr = str.split(" "); // 입력받은 문자열을 배열에 넣어줌
        int i = arr.length; // 변수 i를 배열의 크기로 선언
        if (arr.length ==1 && arr[0].equals("")) // 자꾸 틀린 부분/ 공백 1개로 입력된 문자열도 존재할 수 있음
            bw.write(String.valueOf(0)); // 그 경우 실제 단어는 들어가지 않기 때문에 0 출력
        else bw.write(String.valueOf(i)); // 배열의 크기 출력
        bw.flush();
        bw.close();
    }
}
