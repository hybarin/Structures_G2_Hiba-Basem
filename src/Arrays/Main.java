package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[]numbers={1,2,3,4,5};
        Array arr=new Array();


        //طباعه عاديه
        arr.traversal(numbers);
        arr.R_traversal(numbers);


        // من المستخدم
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
        System.out.println("Enter " + number.length + " numbers");
        for (int i = 0; i < number.length; i++)
            number[i] = scanner.nextInt();
        arr.traversal(number);


        //تعديل
        arr.update(numbers,2,7);


        //حذف
        arr.delete(numbers,2);
        arr.shiftLeft_Delete(numbers,0);
        arr.shiftRight_Delete(numbers, 0);


        //بحث
        int result=arr.LinearSearch(numbers,2);
        if(result!=-1)
            System.out.println("value found at index :"+result);
        else
            System.out.println("Value not found");


        //داله الطباعه النهائيه
        arr.traversal(numbers);

    }
}