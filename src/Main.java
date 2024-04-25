import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        TextAnalysis tekst = new TextAnalysis();

        tekst.switcher();




        System.out.println("Enter first array size");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        NumbersAnalysis numbersAnalysis = new NumbersAnalysis(size);
        NumbersAnalysis numbersAnalysis2 = new NumbersAnalysis(size);

        numbersAnalysis.inputtingToTheBoard();
        System.out.println("Enter second array size");
        numbersAnalysis2.inputtingToTheBoard();

        AnalyzatorOfManyCollectionsOfNumbers analyzatorOfManyCollectionsOfNumbers=new AnalyzatorOfManyCollectionsOfNumbers();


        analyzatorOfManyCollectionsOfNumbers.getNumberAnalysisList().add(numbersAnalysis);
        analyzatorOfManyCollectionsOfNumbers.getNumberAnalysisList().add(numbersAnalysis2); // dodawanie do listy
        System.out.println(analyzatorOfManyCollectionsOfNumbers.getNumberAnalysisList().size()); // wyswietlanie rozmiaru listy
        analyzatorOfManyCollectionsOfNumbers.printListofObjects(); //wyswietlanie wszystkich elementow
        //analizatorWieluKolekcjiLiczb.getListaAnalizLiczb().remove(1); //usuwanie elementu


        //porownywanie tablic
        System.out.println(analyzatorOfManyCollectionsOfNumbers.getNumberAnalysisList().get(0).equals(analyzatorOfManyCollectionsOfNumbers.getNumberAnalysisList().get(1)));

    }


}