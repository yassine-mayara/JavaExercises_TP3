package ex1;
public class Entier {
    public static int valeur = 0;

    public static int factoriel(int n) {
        if (n == 0 || n == 1) {
            return 1;  
        } else {
            return n * factoriel(n - 1);
        }
    }
    
    public static void absolu(int n) {
        System.out.println("Valeur absolue de " + n + " est : " + Math.abs(n));
    }

    public static void comparer(int e1, int e2) {
        if (e1 > e2)
            System.out.println(e1 + " est superieur à " + e2);
        else if (e1 < e2)
            System.out.println(e1 + " est inferieur à " + e2);
        else 
            System.out.println(e1 + " est egal à " + e2);
    }

    public static void premier(int n) {
        boolean estPremier = true;
        if (n <= 1)
            estPremier = false;
        else {
            for (int i = 2; i<=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    estPremier = false;
                    break;
                }
            }
        }
        if (estPremier)
            System.out.println(n + " est un nombre premier.");
        else
            System.out.println(n + " n'est pas un nombre premier.");
    }
}
