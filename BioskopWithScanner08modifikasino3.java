import java.util.Scanner;

public class BioskopWithScanner08modifikasino3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom, pilihan;

        while (true) {
            System.out.println("--- Menu ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            if (pilihan == 1) {
                System.out.print("Masukkan nama: ");
                nama = scanner.nextLine();
                System.out.print("Masukkan baris: ");
                baris = scanner.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = scanner.nextInt();
                scanner.nextLine();

                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi baris " + baris + ", kolom " + kolom + " sudah ditempati oleh " + penonton[baris - 1][kolom - 1] + ".");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data berhasil ditambahkan.");
                    }
                } else {
                    System.out.println("Indeks baris atau kolom tidak valid.");
                }

                System.out.print("Input penonton lainnya? (y/n): ");
                next = scanner.nextLine();
                if (next.equalsIgnoreCase("n")) {
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String namaPenonton = penonton[i][j];
                        if (namaPenonton != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + namaPenonton);
                        } else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": Kosong");
                    }
                }
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih telah menggunakan program.");
                scanner.close();
                return;
             } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1-3.");
            }
    }
}
}
