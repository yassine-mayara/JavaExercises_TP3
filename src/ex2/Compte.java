package ex2;

public class Compte {
    public static int count=0;
    private int numero;
    private float solde;

    public Compte(){
        this.numero=count++;
        this.solde=0;
    }

    public Compte(float solde){
        count++;
        this.numero=count;
        this.solde=solde;
    }

    public void deposer(float montant) {
        if (montant > 0) {
            this.solde += montant;
        } else {
            System.out.println("Montant invalide");
        }
    }

    public void retirer(float montant) {
        if (montant > 0 && montant <= this.solde) {
            this.solde -= montant;
        } else {
            System.out.println("Montant invalide");
        }
    }

    public float getSolde() {
        return this.solde;
    }

    public int getNumero() {
        return this.numero;
    }

    public void transferer(float montant, Compte c) {
        if (montant > 0 && montant <= this.solde) {
            this.retirer(montant);
            c.deposer(montant);
        } else {
            System.out.println("Montant invalide ou solde insuffisant pour le transfert");
        }
    }

}
