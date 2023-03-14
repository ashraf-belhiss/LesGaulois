package personnages;

public class Village {
    private String nom;
    private Chef chef;
    private Gaulois gaulois;
    private Gaulois[] villageois;
    private int nbVillageois = 0;
    private int nbVillageoisMaximum;

    public Village(String nom, int nbVillageoisMaximum) {
        this.nom = nom;
        this.nbVillageoisMaximum = nbVillageoisMaximum;
        this.villageois = new Gaulois[nbVillageoisMaximum];
    }

    public String getNom() {
        return nom;
    }

    public void setChef(Chef chef){
        this.chef = chef;
    }

    public void ajouterHabitant(Gaulois gaulois) {
        villageois[nbVillageois] = gaulois;
        nbVillageois++;
    }

    public Gaulois trouverHabitant(int nVillageois) {
        return villageois[nVillageois];
    }

    public void afficherVillageois(){
        String ch = chef.getNom();
        System.out.println("Dans le village du chef " + ch + " vivent les légendaires Gaulois");
        for (int i=0; i < nbVillageois; i++){
            String pers = villageois[i].getNom();
            System.out.println("-" + pers);
        }
    }

    public static void main(String[] args) {
        Village village = new Village("Village des Irréductibles", 30);
        Chef chief = new Chef("Abracourcix", 6, 1, village);
        village.setChef(chief);
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterHabitant(asterix);
        Gaulois gaulois = village.trouverHabitant(0);
        System.out.println(gaulois);
        village.afficherVillageois();
    }
}
