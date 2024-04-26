import java.util.Arrays;
import java.util.Scanner;

public class NumbersAnalysis {

    private int[] numbers;
    private static int arrayCounter = 0;
    private int arrayNumber;

    public NumbersAnalysis() {
        arrayCounter++;
        arrayNumber = arrayCounter;
        System.out.println("Enter size of " + arrayCounter + " array");
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        numbers = new int[sizeOfArray];
        inputtingToTheBoard();
    }

    public void inputtingToTheBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = scanner.nextInt();
        }


    }

    public String mathematicalCalculations() {
        String result = "Array number: " + arrayNumber + "\n";
        System.out.println(toString());
        System.out.println("Sum of numbers " + Arrays.stream(numbers).sum());
        System.out.println("Avg of numbers" + Arrays.stream(numbers).average().getAsDouble());


        return result;
    }


    @Override
    public String toString() {
        return "NumberAnalysis{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumbersAnalysis that = (NumbersAnalysis) o;
        return Arrays.equals(numbers, that.numbers);
    }

    public int[] getNumbers() {
        return numbers;
    }

    public static int getArrayCounter() {
        return arrayCounter;
    }
}
