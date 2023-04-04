import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        double average = calcAverage(arr, n);
        System.out.println(average);
    }
    public static double calcAverage(int[] arr, int n){
        if (n==0){
            return 0;
        }else{
            return (arr[n-1] + (n-1)*calcAverage(arr, n-1))/n;
        }
    }
}