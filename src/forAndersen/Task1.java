package forAndersen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task1 {
    public static void main(String[] args) {
        int num = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            num = Integer.parseInt(reader.readLine());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(num>7){
            System.out.println("Привет");
        }

    }
}
