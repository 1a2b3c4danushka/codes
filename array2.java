import java.util.Scanner;
public class array2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.println("Elements of Array:");
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[i][j] + "\t");
        }
    }
    
}
}