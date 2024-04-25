import java.util.Arrays;
import java.util.Scanner;

public class NumbersAnalysis  {

    private int [] numbers;


    public NumbersAnalysis(int sizeOfArray ) {

        numbers = new int[sizeOfArray];
    }

    public void inputtingToTheBoard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        for (int i = 0; i < numbers.length; i++){

            numbers[i]=scanner.nextInt();
        }


    }

    public void mathematicalCalculations(){
        System.out.println(toString());
        System.out.println("Sum of numbers "+ Arrays.stream(numbers).sum() );
        System.out.println("Avg of numbers"+ Arrays.stream(numbers).average().getAsDouble());


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
}
