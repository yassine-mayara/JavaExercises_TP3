package ex2;

public class Banque {
    public static void main(String[] args) {
        Compte co1 = new Compte();
        Compte co2 = new Compte(200);

        System.out.println("Compte 1 - Numero : " + co1.getNumero() + ", Solde : " + co1.getSolde() + " DT");
        System.out.println("Compte 2 - Numero : " + co2.getNumero() + ", Solde : " + co2.getSolde() + " DT");

        co1.deposer(1200);
        co2.deposer(500);

        System.out.println("Apres depot :");
        System.out.println("Compte 1 - Solde : " + co1.getSolde() + " DT");
        System.out.println("Compte 2 - Solde : " + co2.getSolde() + " DT");

        co2.transferer(700, co1);

        System.out.println("Apres transfert :");
        System.out.println("Compte 1 - Solde : " + co1.getSolde() + " DT");
        System.out.println("Compte 2 - Solde : " + co2.getSolde() + " DT");

        if (co1.getSolde() < 0) {
            System.out.println("Compte 1 est en rouge avec un solde de " + co1.getSolde() + " DT");
        }

        if (co2.getSolde() < 0) {
            System.out.println("Compte 2 est en rouge avec un solde de " + co2.getSolde() + " DT");
        }
    }
}
