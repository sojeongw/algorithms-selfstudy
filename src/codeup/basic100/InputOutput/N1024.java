package codeup.basic100.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] b = a.split("");
        for(int i=0; i<b.length; i++){
            System.out.println("\'" + b[i] + "\'");
        }
    }
}
