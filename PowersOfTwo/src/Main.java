import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.printf("Sayı Giriniz: ");
        int s = input.nextInt();


        for (int i = 1; i < s; i*=2) {
            System.out.printf("\nİkinin Kuvvetleri: " + i);
        }

        for (int j = 1; j < s; j*=5) {
            System.out.printf("\n5'in Kuvvetleri: " + j);

        }
        for (int k = 1; k < s; k*=4) {
            System.out.printf("\n4'in Kuvvetleri: " + k);

        }
    }
}