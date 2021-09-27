package forAndersen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = null;

        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(name.equals("Вячеслав")){
            System.out.println("Привет, "+name);
        }
        else{
            System.out.println("Нет такого имени");
        }
    }
}
