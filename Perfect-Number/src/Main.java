import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number, total = 0;

        System.out.print("Sayı giriniz => ");
        number = scan.nextInt();

        for (int i = 1; i < number; i++){
            if (number % i == 0){

                total += i;

            }
        }

        if (total == number)
            System.out.println(number + " Mükemmel sayıdır.");
        else
            System.out.println(number + " Mükemmel sayı değildir.");

    }
}
