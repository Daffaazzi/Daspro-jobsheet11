import java.util.Scanner;
public class Tugas08 {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] dataSurvey = new int [10][6];

    for (int i = 0; i < dataSurvey.length; i++) {
        System.out.println("Perespon ke-" + (i +1 ));
        for(int j = 0; j < dataSurvey[i].length; j++) {
            System.out.print("Masukkan rating (1-5) untuk pertanyaan ke-" + (j + 1 )+ ":");
            dataSurvey[i][j] = scanner.nextInt();

            if (dataSurvey[i][j] < 1 || dataSurvey[i][j] > 5) {
                System.out.println("Rating tidak valid, Silahkan masukkan rating antara 1-5. Silahkan masukka ulang "+": ");

            }

        }
    }
    System.out.println("\nRata-rata nilai untuk setiap peresponden:");
    for (int j = 0; j < dataSurvey.length; j++) {
        int total = 0;
        for(int i = 0; i < dataSurvey[j].length; i++) {
            total += dataSurvey[j][i];
        }
        double rataRata = (double) total /dataSurvey[j].length;
        System.out.printf("Pertanyaan ke-%d: %.2f%n", (j+1),rataRata);
    }
    System.out.println("Rata-rata Rating untuk setiap pertanyaan" + ": ");
    for (int i = 0; i < dataSurvey[0].length; i++) {
        int total = 0;
        for (int j = 0; j < dataSurvey.length; j++) {
            total += dataSurvey[j][i];
        }
        double rataRata = (double) total / dataSurvey.length;
        System.out.printf("Pertanyaan ke-%d: %.2f%n", (i + 1), rataRata);
    }

    System.out.println("Rata-rata Rating keseluruhan" + ": ");
    int totalKeseluruhan = 0;
    for (int i = 0; i < dataSurvey.length; i++){
        for (int j = 0; j < dataSurvey[i].length; j++){
            totalKeseluruhan += dataSurvey[i][j];        
        }
    }
    double rataRataKeseluruhan = (double) totalKeseluruhan / (dataSurvey.length * dataSurvey[0].length);
    System.out.printf("Rata-rata Rating keseluruhan: %.2f%n", rataRataKeseluruhan);
    scanner.close();
}
}
