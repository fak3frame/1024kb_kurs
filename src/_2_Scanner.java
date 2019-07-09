import java.util.Scanner;

public class _2_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int zmiennaCalkowita;
        float zmiennaZmeinnoprzecinkowa;

        System.out.println("Podaj zmienna calkowita");
        zmiennaCalkowita = scanner.nextInt();


        System.out.println("Wprowadziłes zmienna calkowitą : "+zmiennaCalkowita);
        System.out.println();

        System.out.println("Podaj zmienna zmiennoprzecinkowa");
        zmiennaZmeinnoprzecinkowa = scanner.nextFloat();


        System.out.println("Wprowadziłes zmienna zmiennoprzecinkowa : "+zmiennaZmeinnoprzecinkowa);

        /////////////////////

        String napis;

        System.out.println("Podaj napis:");
        napis = scanner.next(); // wczyta tylko do "spacji"
        napis = scanner.nextLine(); //wczyta do "entera
        System.out.println("Wpisales napis : "+napis);



    }
}
