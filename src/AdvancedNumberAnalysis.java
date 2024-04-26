public class AdvancedNumberAnalysis extends NumbersAnalysis {

    public AdvancedNumberAnalysis() {
        super();
    }


    public String howManyEvenAndOddNumbers() {
        String result = "";
        int sumEven = 0;
        int sumOdd = 0;

        for (int number : getNumbers()) {
            if (number % 2 == 0) {
                sumEven++;

            } else {
                sumOdd++;


            }


        }
        result += "the sum of even numbers is: " + sumEven + "\n";
        result += "the sum of odd numbers is: " + sumOdd + "\n";

        return result;
    }


}
