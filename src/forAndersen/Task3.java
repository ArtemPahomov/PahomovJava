package forAndersen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {
        //DataInArray();  /*через массивы*/
        DataInList(); /*через ArrayList*/
    }

    public static void DataInList() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int num;
        while (true) {
            try {
                num = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i) % 3 == 0) {
                        System.out.println(arrayList.get(i));
                    }
                }
                break;
            }
            arrayList.add(num);
        }
    }

    public static void DataInArray() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr;
        int size = 0;
        System.out.println("Введите размер массива");
        try {
            size = Integer.parseInt(reader.readLine());
            arr = new int[size];
            System.out.println("Введите числа");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 3 == 0) {
                    System.out.println(arr[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
