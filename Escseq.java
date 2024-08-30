import java.util.Scanner;

class Escape {
    public static void main(String[] args) {
    
        int ctr = 10;
        int multiplier =1;
        
        while (ctr >= multiplier){
            int product = 7 * multiplier;
            int check = multiplier % 2;
            if (check == 1){
                System.out.println(product);
            }
            else{
                System.out.println("\t" +product);
            }
            multiplier++;
        }
    }
}
