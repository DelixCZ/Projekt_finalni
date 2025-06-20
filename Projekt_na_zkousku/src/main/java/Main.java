import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Evidence evidence = new Evidence();

    public static void main(String[] args) {
        while (true) {
            System.out.println("===============================");
            System.out.println("Evidence pojištěných");
            System.out.println("===============================");
            System.out.println("1 – Přidat nového pojištěného");
            System.out.println("2 – Vypsat všechny pojištěné");
            System.out.println("3 – Vyhledat pojištěného");
            System.out.println("4 – Konec");

            String volba = scanner.nextLine();

            switch (volba) {
                case "1":
                    pridatPojisteneho();
                    break;
                case "2":
                    evidence.vypisVsechny();
                    break;
                case "3":
                    vyhledatPojisteneho();
                    break;
                case "4":
                    System.out.println("Ukončuji aplikaci...");
                    return;
                default:
                    System.out.println("Neplatná volba.");
            }

            System.out.println("\nPokračujte libovolnou klávesou...");
            scanner.nextLine();
        }
    }

    private static void pridatPojisteneho() {
        System.out.print("Zadejte jméno pojištěného: ");
        String jmeno = scanner.nextLine().trim();
        if (jmeno.isEmpty()) {
            System.out.println("Jméno nesmí být prázdné.");
            return;
        }

        System.out.print("Zadejte příjmení: ");
        String prijmeni = scanner.nextLine().trim();

        System.out.print("Zadejte věk: ");
        int vek = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("Zadejte telefonní číslo: ");
        String telefon = scanner.nextLine().trim();

        evidence.pridatPojisteneho(new Pojisteny(jmeno, prijmeni, vek, telefon));
        System.out.println("Data byla uložena.");
    }

    private static void vyhledatPojisteneho() {
        System.out.print("Zadejte jméno pojištěného: ");
        String jmeno = scanner.nextLine().trim();
        System.out.print("Zadejte příjmení: ");
        String prijmeni = scanner.nextLine().trim();

        evidence.vyhledat(jmeno, prijmeni);
    }
}
