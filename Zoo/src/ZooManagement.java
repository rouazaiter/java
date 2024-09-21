import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();
        System.out.print("Entrez le nombre de cages : ");
        int nbrCages;
        while (true) {
            try {
                nbrCages = Integer.parseInt(scanner.nextLine());
                if (nbrCages < 0) {
                    System.out.print("Le nombre de cages doit être positif. Réessayez : ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Veuillez entrer un nombre entier valide. Réessayez : ");
            }
        }

        // Affichage des informations
        System.out.println(zooName + " comporte " + nbrCages + " cages");

        // Fermeture du scanner
        scanner.close();
    }
}
