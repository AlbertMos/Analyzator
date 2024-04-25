import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalyzatorOfManyCollectionsOfNumbers  {



    private List<NumbersAnalysis> numberAnalysisList;

    public AnalyzatorOfManyCollectionsOfNumbers() {
        numberAnalysisList = new ArrayList<>();
    }

    public List<NumbersAnalysis> getNumberAnalysisList() {
        return numberAnalysisList;
    }


    public void printListofObjects() {
        for (NumbersAnalysis element: numberAnalysisList) {
            element.mathematicalCalculations();
        }
    }


}
