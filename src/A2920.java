import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [] arr = new int[8];
        String result = "";

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i =0; i<8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i =0; i<arr.length-1; i++) {
            if (arr[i] == arr[i+1]-1) {
                result = "ascending";
            } else if (arr[i]==arr[i+1]+1) {
                result = "descending";
            }
            else {
                result = "mixed";
                break;
            }
        }
        bw.write(result);
        bw.flush();
        bw.close();

    }
}
