import java.util.InputMismatchException;
import java.util.Scanner;

public class TextAnalysis extends Menu {
    String objectText;
    String objectText2;

    public void setObjectText(String objectText) {
        this.objectText = objectText;
    }

    public void setObjectText2(String objectText2) {
        this.objectText2 = objectText2;
    }

    private void print(String text) {

        System.out.println(text + "\nText length: " + text.length() + "\n first letter " + text.charAt(0));
    }

    public boolean analyse(String objectText, String objectText2) {


        return objectText.equals(objectText2);
    }

    public int converterKilometersPerMile(int numberOfKilometers) throws NegativeNumberException {
        if (numberOfKilometers < 0) {
            throw new NegativeNumberException();
        }
        return (int) (numberOfKilometers * 1.852);
    }

    public void printMenu() {
        int option;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your choice: 1. Display 2. Load text 3. Analyze two texts 4. Convert km to miles 0. Close the program");


            while (!scanner.hasNextInt()) {
                System.out.println("Invalid options entered. Please re-enter:");
                scanner.next();
            }

            option = scanner.nextInt(); // Odczytaj liczbę

            switch (option) {
                case 1:
                    print("Hola amigos!");
                    break;
                case 2:
                    scanner.nextLine(); // Wyczyść znak nowej linii z bufora
                    System.out.println("Enter text");
                    setObjectText(scanner.nextLine());
                    System.out.println(objectText);
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter first text");
                    setObjectText(scanner.nextLine());
                    System.out.println("Enter second text");
                    setObjectText2(scanner.nextLine());
                    if (analyse(objectText, objectText2)) {
                        System.out.println("Same");
                    } else {
                        System.out.println("Not same");
                    }
                    break;
                case 4:
                    boolean correctData = false;
                    do {
                        System.out.println("Enter number of km:");
                        try {
                            System.out.println("Numbers of mile" + converterKilometersPerMile(scanner.nextInt()));
                            correctData = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Mistake. Give a number, not words. Try again.");
                            scanner.next();
                        } catch (NegativeNumberException e) {
                            System.out.println(e.getMessage());
                        }
                    } while (!correctData);
                    break;
                case 0:
                    System.out.println(" Shutting down the system ");

                    break;
                default:
                    System.out.println(" Invalid option. Please re-administer. ");
                    break;
            }
        } while (option != 0);


    }

    @Override
    public void description() {
        System.out.println("2. Text Analyzator");
    }
}