import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class A1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        str = str.trim();

        String [] arr = str.split(" ");
        int i = arr.length;
        if (arr.length ==1 && arr[0].equals(""))
            bw.write(String.valueOf(0));
        else bw.write(String.valueOf(i));
        bw.flush();
        bw.close();
    }
}
