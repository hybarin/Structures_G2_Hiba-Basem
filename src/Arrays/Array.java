package Arrays;


public class Array {

    public void traversal(int[]number){
        for(int i=0;i<number.length;i++)
            System.out.println("Index["+i+"]="+number[i]);
    }

    public void R_traversal(int[]a){
        for(int i=4;i>=0;i--)
            System.out.println("Index["+i+"]="+a[i]);
    }
}
