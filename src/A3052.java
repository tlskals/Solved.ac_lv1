import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class A3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[10];
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        int count = 1;

        for (int i=0; i< num.length; i++) {
            arr[i] = num[i] % 42;
        }

        Arrays.sort(arr);

        for (int j=1; j<arr.length; j++) {
            if (arr[j] != arr[j-1] ) {
                count++;
            }

        }
        bw.write(String.valueOf(count));
        br.close();
        bw.flush();
        bw.close();
    }
}