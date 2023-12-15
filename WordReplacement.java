import java.io.*;

public class WordReplacement {

    public static void replaceword(String inputFile,String outputFile,String targetword,String replacement){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile);

            String line;
            while ((line=reader.readLine())!=null) {
                String modifiedLine = line.replaceAll(targetword, replacement);
                writer.write(modifiedLine+"\n");
            }

            System.out.println("File replaced successfully!");

            reader.close();
            writer.close();
        }
        catch(IOException e){
            System.err.println("An error occured: "+e.getMessage());
        }
    }    
    public static void main(String[] args) {
        String inputFile="input.txt";
        String outputFile="output.txt";

        String targetword="STRUGGLE";
        String replacement="LIFE";

        replaceword(inputFile,outputFile,targetword,replacement);


    }
}
