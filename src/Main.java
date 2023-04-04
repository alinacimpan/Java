import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        List<Produs> listProduss = RepoDbProdus.getInstance().findAll();

        System.out.println();
        listProduss.forEach(System.out::println);
        System.out.println();



        //for(Produs Produs :ServiceProdus.getInstance().getAll())
        //    if(Objects.equals(Produs.getnume(), "pop") && Objects.equals(Produs.getcategorie(), "ion"))
        //        System.out.println(Produs);
        //System.out.println();
        listProduss.stream().filter(Produs -> Produs.getnume().equals("iaurt") ).forEach(System.out::println);
        System.out.println();
        // System.out.println("Introduceti numel dorit: ");
        // Scanner scanner = new Scanner(System. in);
        // String inputString = scanner. nextLine();
        // listProduss.stream().filter(Produs -> Produs.getnume().equals(inputString) ).forEach(System.out::println);
        // System.out.println();


        //for(Produs Produs :ServiceProdus.getInstance().getAll())
        //    if(Objects.equals(Produs.getdescriere(), "222"))
        //        System.out.println(Produs);
        //System.out.println();

        listProduss.stream().filter(Produs -> Produs.getcategorie().equals("alimente")).forEach(System.out::println);
        System.out.println();



        listProduss.stream().filter(Produs -> {return Produs.getpret() < 10 && Produs.getcategorie().equals("alimente");}).forEach(System.out::println);
        System.out.println();



        //sorteaza alfabetic descrescator dupa nume si categorie
        List<Produs> sortedList  = new ArrayList<>(listProduss);
        sortedList.sort(new Comparator<Produs>() { public int compare(Produs o1, Produs o2) {return o2.getnume().compareTo(o1.getnume());}});
        sortedList.stream().map(s -> s.getId() + " " + s.getnume() + " " + s.getcategorie()).forEach(System.out::println);
        System.out.println();

        //sorteaza alfabetic descrescator dupa nume si categorie
        /*List<Produs> sortedList  = new ArrayList<>(listProduss);
        sortedList.sort(new Comparator<Produs>() {  public int compare(Produs o1, Produs o2) {
            int cmp = o1.getnume().compareTo(o2.getnume());
            if (cmp != 0) {
                return cmp;
            }
            return Integer.valueOf(o1.getcategorie()).compareTo(o2.getcategorie());
        }});
        sortedList.stream().map(s -> s.getId() + " " + s.getnume() + " " + s.getcategorie()).forEach(System.out::println);
        System.out.println();

*/


        //soreteaza descrescator dupa descriere

        List<Produs> sortedList2  = new ArrayList<>(listProduss);
        sortedList2.sort(new Comparator<Produs>() { public int compare(Produs o1, Produs o2) {return o2.getdescriere().compareTo(o1.getdescriere());}});
        sortedList2.stream().map(s -> s.getnume() + " " + s.getcategorie() + " " + s.getdescriere()).forEach(System.out::println);
        System.out.println();


        //sorteaza crescator dupa pret
        List<Produs> sortedList3  = new ArrayList<>(listProduss);
        sortedList3.sort(new Comparator<Produs>() { public int compare(Produs o1, Produs o2) {return Double.compare(o1.getpret(),o2.getpret());}});
        sortedList3.stream().map(s -> s.getId() + " " + s.getpret()).forEach(System.out::println);
        System.out.println();





    }
}