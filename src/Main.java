import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("__--Albert Mossakowski--__");
        AnalyzatorOfManyCollectionsOfNumbers analyzatorOfManyCollectionsOfNumbers = new AnalyzatorOfManyCollectionsOfNumbers();
        TextAnalysis textAnalysis = new TextAnalysis();
        List<Menu> menu = new ArrayList<>();
        menu.add(analyzatorOfManyCollectionsOfNumbers); //przyklad wirtualnosci, abstrakcji
        menu.add(textAnalysis);


        int option = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nChoose functionality");
            for (Menu element : menu) {
                element.description();
            }

            try {
                option = scanner.nextInt();
                if (option < 0) {
                    throw new NegativeNumberException();
                }
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {

                System.out.println("Error. Dont put letters");
                scanner.next();
            }


        } while (option != 1 && option != 2);

        switch (option) {
            case 1:
                analyzatorOfManyCollectionsOfNumbers.printMenu();
                break;
            case 2:
                textAnalysis.printMenu();
                break;
        }


    }


}