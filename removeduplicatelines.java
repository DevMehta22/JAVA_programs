import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class removeduplicatelines {
    public static void main(String[] args) {
        String inputFile = "input.txt"; 
        String outputFile = "output.txt"; 

        try {
            
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile);

            Set<String> uniqueLines = new HashSet<>();
            String line;

            while ((line = reader.readLine()) != null) {
                uniqueLines.add(line);
            }

            for (String uniqueLine : uniqueLines) {
                writer.write(uniqueLine + "\n");
            }

            reader.close();
            writer.close();

            System.out.println("Duplicate lines removed and saved to " + outputFile);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
