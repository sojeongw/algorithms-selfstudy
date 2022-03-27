package baekjoononlinejudge.stepbystep.alignment;

import java.io.*;
import java.util.Arrays;

public class AlignNumber_2750 {
    public static void main(String[] args) throws IOException {
        // 84ms
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
           arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        Arrays.sort(arr);

        for(int a : arr){
            bw.write(a + "\n");
        }
        bw.close();
    }
}