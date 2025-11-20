import java.util.Scanner;
import java.util.Arrays;

public class Numbers08modifikasi {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);   
        
        int[][]myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];  
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        } //no 1

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke_" + (i+1) + ": " + myNumbers[i].length);
        }//no 4

        scanner.close();
        }
    }

