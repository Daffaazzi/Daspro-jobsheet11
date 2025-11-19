import java.util.Scanner;

public class BioskopWithScanner08 {
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    String [][] penonton = new String[4][2];
    String nama, next;
    int baris, kolom;

    while (true) {
        System.out.print("Masukkan nama: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan baris: ");
        baris = scanner.nextInt();
        System.out.print("Masukkan kolom: ");
        kolom = scanner.nextInt();
        scanner.nextLine();

        penonton[baris-1][kolom-1] = nama;

        System.out.print("Input penonton lainnya? (y/n): ");
        next = scanner.nextLine();

        if(next.equalsIgnoreCase("n")){
            break;
        }
    }
}
}

