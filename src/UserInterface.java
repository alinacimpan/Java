
/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInterface {

    protected Service utilizatorService;

    /**
     * Creeaza o instanta de interfata cu utilizatorul
     * @param utilizatorService -service-ul pentru utilizatori

    public UserInterface(Service utilizatorService) {
        this.utilizatorService = utilizatorService;
    }

    public void printMenu() {
        System.out.println("    1. Afisare alimente");
        System.out.println("    2. Filtrare alimente categorie");
        System.out.println("    3. Filtrare alimente categorie");
        System.out.println("    4. Filtrare alimente categorie si pret");
        System.out.println("    5. Sortare dupa categorie,nume, descrescator");
        System.out.println("    6. Sortare dupa descriere, descrescator");
        System.out.println("    7. Sortare dupa pret, crescator");
        System.out.println("\nx << Iesire");
    }


    public void handleOption(String option) {
        switch(option) {
            case "1":
                System.out.println("\nProduse:");
                utilizatorService.getAll().forEach(System.out::println);
                break;
            case "2":
                System.out.println("\nProduse filtrati:");
                utilizatorService.filtrarenume().forEach(System.out::println);
                break;
            case "3":
                System.out.println("\nProduse filtrati:");
                utilizatorService.filtrarecategorie2().forEach(System.out::println);
                break;
            case "4":
                System.out.println("\nProduse sortati:");
                utilizatorService.filtrarecategorie1().forEach(System.out::println);
                break;
            case "5":
                System.out.println("\nProduse sortati:");
                utilizatorService.sortareAutorTitlu().forEach(System.out::println);
                break;
            case "6":
                System.out.println("\nProduse sortati:");
                utilizatorService.sortareGen().forEach(System.out::println);
                break;
            case "7":
                System.out.println("\nProduse sortati:");
                utilizatorService.sortarePret().forEach(System.out::println);
                break;
            default:
                System.out.println("\nOptiunea nu a fost gasita!");
                break;
        }
    }


    public void runInterface() {
        while(true) {
            try {
                printMenu();
                System.out.println("\nIntroduceti optiunea dorita: ");
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                String line = input.readLine();
                String option = line.strip().split(" ")[0];

                if(option.equals("x"))
                    return;
                else handleOption(option);
            }
            catch (IOException ie) {
                System.out.println("\nEroare:\n");
                ie.printStackTrace();
                System.out.println("---> reincercati!");
            }

        }
    }
}
*/