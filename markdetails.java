import java.io.*;

public class markdetails {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("std1,80\n");
        writer.write("std2,66\n");
        writer.write("std3,70\n");
        writer.write("std4,42\n");
        writer.write("std5,60\n");
        writer.write("std6,75\n");
        writer.write("std7,53\n");
        writer.write("std8,80\n");
        writer.write("std9,65\n");
        writer.write("std10,100\n");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            int marks = Integer.parseInt(parts[1]);
            if (marks > 70) {
                System.out.println(name);
            }
        }
        reader.close();
    }
}

