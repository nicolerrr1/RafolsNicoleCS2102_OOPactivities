import java.util.Scanner;

public class GettingGreater {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("Getting the Greater Value");
    System.out.println("Enter first character: ");
    char firstChar = input.nextLine().charAt(0);
    
    System.out.println("Enter second character: ");
    char secondChar = input.nextLine().charAt(0);
    
    char greaterChar =( char) Math.max(firstChar , secondChar);
    
    System.out.println("---------------------------------");
    System.out.println("The character with greater value is: " +greaterChar);
    System.out.println("----------------------------------");
    System.out.println("Shwoing the ASCII Codes");
    System.out.println(firstChar+ ":" + (int) firstChar);
    System.out.println(secondChar+ ":" + (int) secondChar);
    
    }
}