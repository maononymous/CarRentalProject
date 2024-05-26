package assignment2;
import java.io.FileWriter;
import java.io.IOException;

public class Report {
    public static void printToConsole(Reportable reportable){
        System.out.println(reportable.generateReport());
    }
    public static void persistToCSV(Reportable reportable, String fileName){
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.append(reportable.generateReport());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
