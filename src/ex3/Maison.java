package ex3;

public class Maison {
    private String type;
    private String adr;
    private int nbchambre;
    private float surface;

    public Maison(String adr, String type, int nbchambre) {
        this.adr = adr;
        this.type = type;
        this.nbchambre = nbchambre;
    }

    public Maison(String adr, String type, int nbchambre, float surface) {
        this.adr = adr;
        this.type = type;
        this.nbchambre = nbchambre;
        this.surface = surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public float calculPrix(float pmc) {
        return surface * pmc;
    }

    public float calculPrix() {
        return surface * 2100;
    }

    public String toChaine() {
        return "Un " + type + " de " + surface + "m² à " + adr + " avec " + nbchambre + " chambres";
    }

    public static void main(String[] args) {
        Maison m1 = new Maison("Tunis", "duplex", 4, 210);
        Maison m2 = new Maison("Nabeul", "villa", 5);

        System.out.println(m1.toChaine());
        System.out.println(m2.toChaine());

        m2.setSurface(230);

        System.out.println("Apres modification : ");
        System.out.println(m2.toChaine());

        System.out.println("Prix de m1 avec pmc = 2100 : " + m1.calculPrix());
        System.out.println("Prix de m2 avec pmc = 2100 : " + m2.calculPrix());

        float pmc = 2500;
        System.out.println("Prix de m1 avec pmc = " + pmc + " : " + m1.calculPrix(pmc));
        System.out.println("Prix de m2 avec pmc = " + pmc + " : " + m2.calculPrix(pmc));
    }
}
