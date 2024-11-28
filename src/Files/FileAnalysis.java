package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.*;

public class FileAnalysis {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try {

            String content = Files.readString(Path.of(inputFileName));
            String[] lines = content.split("\n");
            int lineCount = lines.length;

            int wordCount = 0;
            for (String line : lines) {
                wordCount += line.split("\\s+").length;
            }


            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
                writer.write("Analysis of " + inputFileName + ":\n");
                writer.write("Number of lines: " + lineCount + "\n");
                writer.write("Number of words: " + wordCount + "\n");
            }

            System.out.println("Analysis completed. Check the output file: " + outputFileName);

        } catch (IOException e) {
            System.err.println("Error while reading or writing files: " + e.getMessage());
        }
    }
}

