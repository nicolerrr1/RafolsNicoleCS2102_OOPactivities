import java.util.Scanner;

public class GetArrayMean {
    public static double getArrayMean(int[] array) {
        int sum =0;
        for(int num: array){
            sum += num;
        }
        return (double) sum/array.length;
        
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of element:");
    int n = scanner.nextInt();
    int [] number = new int[n];

    for (int i = 0; i < n; i++){
        System.out.print("Enter number:");
        number[i] = scanner.nextInt();
    }
    double mean = getArrayMean(number);

    System.out.printf("Mean of array is: %.2f", mean);
    }
}




