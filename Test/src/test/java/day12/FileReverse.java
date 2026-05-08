package day13;

import java.io.*;

public class FileReverse {
    public static void main(String[] args) throws Exception {
        File file = new File("data.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        reader.close();
        String reversed = sb.reverse().toString();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(reversed);
        writer.close();
    }
}

