import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class A10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine()); //5
        StringTokenizer st = new StringTokenizer(br.readLine()); // 10,35,30,7

        int i = 0;
        int[] arr = new int[a];
        while(st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        Arrays.sort(arr);
        bw.write(arr[0] + " " + arr[a - 1]);
        bw.flush();
        bw.close();
    }
}
