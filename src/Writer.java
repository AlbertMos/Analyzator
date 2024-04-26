import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public void writeToFile(AnalyzatorOfManyCollectionsOfNumbers object, String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            String linia = object.printListofObjects();
            writer.write(linia);
            System.out.println("The object has been saved to a file ");
        } catch (IOException e) {
            System.err.println("A write error occurred " + e.getMessage());
        }


    }
}
