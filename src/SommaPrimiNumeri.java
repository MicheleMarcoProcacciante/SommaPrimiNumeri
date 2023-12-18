import java.util.Scanner;

public class SommaPrimiNumeri {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero N: ");
        int numroN = scanner.nextInt();

        int somma = 0;

        //ciclo

        for(int i = 0; i <= numroN; i++){

            somma = somma + i;

        }

        System.out.println("la somma dei primi numeri: " + numroN + "è uguale a: " + somma);
        scanner.close();


    }
}
