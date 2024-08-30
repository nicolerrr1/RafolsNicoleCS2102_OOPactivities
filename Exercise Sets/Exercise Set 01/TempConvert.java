import java.util.Scanner;

class Convert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Celsius value: ");
        float C = input.nextInt();
        float F = (C*9/5) + 32;
        System.out.println(C + " celsius is "+ F + " Farenheit");
    }
}