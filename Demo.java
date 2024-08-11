//K largest Element in an array using sorting
import java.util.*;
public class Demo{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int [] arr=new int[size];

        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Your array is" + Arrays.toString(arr));
        System.out.println("Enter the k element");
        int k=sc.nextInt();
        int i=arr.length-1;
        System.out.println("K th maximum element is:");
        while(k>0){
            System.out.println(arr[i]);
            k--;
            i--;
        }
    }
}