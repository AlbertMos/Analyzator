import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnalyzatorOfManyCollectionsOfNumbers extends Menu {


    private List<AdvancedNumberAnalysis> advancedNumberAnalysisList;

    public AnalyzatorOfManyCollectionsOfNumbers() {
        advancedNumberAnalysisList = new ArrayList<>();
    }

    public List<AdvancedNumberAnalysis> getNumberAnalysisList() {
        return advancedNumberAnalysisList;
    }


    public String printListofObjects() {
        String result = "";
        for (AdvancedNumberAnalysis element : advancedNumberAnalysisList) {
            result += element.mathematicalCalculations() + "\n";
            result += element.howManyEvenAndOddNumbers() + "\n";
        }

        result += "The result of comparing the first and second elements: " +
                (getNumberAnalysisList().get(0)
                        .equals(getNumberAnalysisList().get(1))) +
                "\n";


        return result;
    }


    public void printMenu() {


        int opcja;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your choice:\n 1. Print arrays \n 2.Create and insert into the board\n 3.Enter the number of even and odd numbers\n 4.Write to file\n 5. Enter the number of boards\n 0. Close program");


            while (!scanner.hasNextInt()) {
                System.out.println("Invalid options entered. Please re-administer:");
                scanner.next();
            }
            String wyswietl;
            opcja = scanner.nextInt(); // Odczytaj liczbę

            switch (opcja) {
                case 1:
                    try {
                        wyswietl = printListofObjects();
                        System.out.println(wyswietl);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(" ATTENTION! There are no boards yet or too few boards (minimum 2) " + e.getMessage());
                    }

                    break;
                case 2:
                    advancedNumberAnalysisList.add(new AdvancedNumberAnalysis());
                    break;
                case 3:

                    for (AdvancedNumberAnalysis element : advancedNumberAnalysisList) {
                        wyswietl = element.howManyEvenAndOddNumbers();
                        System.out.println(wyswietl);
                    }
                    break;
                case 4:
                    String sciezkaDoPliku = "file.txt";
                    Writer zapisywanie = new Writer();
                    zapisywanie.writeToFile(this, sciezkaDoPliku);
                    break;
                case 5:
                    System.out.println("The number of boards is: " + AdvancedNumberAnalysis.getArrayCounter() + "\n");
                    //System.out.println(listaZaawansowanaAnalizaLiczb.size()); //drugi sposob
                case 0:
                    System.out.println("Closing system");

                    break;
                default:
                    System.out.println("Invalid option. Please re-administer.");
                    break;
            }
        } while (opcja != 0);


    }


    @Override
    public void description() {
        System.out.println("1. Number Collection Analyzer");
    }


}
