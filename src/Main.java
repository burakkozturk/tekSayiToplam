import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayi Gir ");
        x = input.nextInt();

        for(int i =0 ; i<=x ; i++){
            if (i % 2 == 1){
                toplam += i;
            }
        }
    System.out.println(toplam);
    }
}