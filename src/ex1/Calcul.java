package ex1;
import java.util.Scanner;  

public class Calcul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Entrez un entier : ");
        int n = scanner.nextInt();
        System.out.println("Factoriel de " + n + " : " + Entier.factoriel(n));

        System.out.print("Entrez un entier : ");
        int absValue = scanner.nextInt();
        Entier.absolu(absValue);

        System.out.print("Entrez le 1er entier pour la comparaison: ");
        int e1 = scanner.nextInt();
        System.out.print("Entrez le 2eme entier pour la comparaison: ");
        int e2 = scanner.nextInt();
        Entier.comparer(e1, e2);

        System.out.print("Entrez un entier : ");
        int p = scanner.nextInt();
        Entier.premier(p);

        System.out.println("Valeur initiale : " + Entier.valeur);
        Entier.valeur++;
        System.out.println("incrementation 1 : " + Entier.valeur);
        Entier.valeur += 1;
        System.out.println("incrimentation 2 : " + Entier.valeur);

        scanner.close();
    }
}
