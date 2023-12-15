// // import java.io.BufferedReader;
// // import java.io.FileReader;
// // import java.io.FileWriter;
// // import java.io.IOException;

// // public class filehandling{
// //     public static void main(String[] args) {
// //         String inputFile="input.txt";
// //         String outputFile="output.txt";
// //         try{
// //             BufferedReader reader = new BufferedReader(new FileReader(inputFile));
// //             FileWriter writer = new FileWriter(outputFile);

// //             String line;
// //             while ((line=reader.readLine())!=null) {
// //                 writer.write(line.toLowerCase()+'\n');
// //             }

// //             System.out.println("File converted successfully");

// //             reader.close();
// //             writer.close();
// //         }
// //         catch(IOException e){
// //             System.err.println("An error occured: "+e.getMessage());
// //         }
// //     }
// // }

// import java.io.*;
// public class filehandling{
//     public static void main(String[] args) throws Exception
//     {
//         FileReader fr = new FileReader("input.txt");
//         FileWriter fw = new FileWriter("output.txt", true);
//         BufferedReader br = new BufferedReader(fr);
//         BufferedWriter bw = new BufferedWriter(fw);
//         String line = br.readLine();
//         while((line != null))
//         {
//             bw.write(line.replace("RIYALL", "REAL"));
//             line = br.readLine();
//         } 
//         bw.flush();
//         bw.close();
//         br.close();
//     }
// }

import java.io.*;
import java.util.HashSet;

public class filehandling {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        HashSet<String> lines = new HashSet<String>();
        String line;
        while ((line = reader.readLine()) != null) {
            if (lines.add(line)) {
                writer.write(line);
                writer.newLine();
            }
        }
        reader.close();
        writer.close();
    }
}

