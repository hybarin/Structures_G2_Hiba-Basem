package Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // int[]numbers={1,2,3,4,5};
      //  Array arr=new Array();

       // arr.traversal(numbers);
      //  arr.R_traversal(numbers);


        // من المستخدم

        Scanner scanner=new Scanner(System.in);
        Array arr=new Array();
        int []number=new int[5];
        System.out.println("Enter "+number.length+" numbers");
        for (int i=0; i<number.length; i++)
            number[i]=scanner.nextInt();
        arr.traversal(number);
    }
}