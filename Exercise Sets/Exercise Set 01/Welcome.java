import java.util.Scanner;

class Welcome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to CS 211: Object-oriented Programming");
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("This course will be fun," +name);
    }
}