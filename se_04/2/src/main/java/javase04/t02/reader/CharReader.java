package javase04.t02.reader;

import java.io.*;
import java.util.*;

/**
 * Created by Drazz on 02.11.2015.
 */
public class CharReader {
    private File inputFile = new File("src/main/java/javase04/t02/reader/CharReader.java");
    private File outputFile = new File("src/main/resources/CharReader.txt");
    private Reader inFile = null;
    private Writer outFile = null;
    private String[] kwords = new String[]{"for", "while", "new", "public", "private", "class", "import", "static",
        "package", "try", "catch", "if", "finally", "else"};

    public void readFile() {
        try {
            inFile = new FileReader(inputFile);
            char fileContent[] = new char[(int) inputFile.length()];
            inFile.read(fileContent);
            String s = new String(fileContent);
            writeFile(countKWords(s));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inFile != null) {
                    inFile.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }
    }

    private HashMap<String, Integer> countKWords(String s) {
        List<String> list = Arrays.asList(s.split("\\W+"));
        HashMap<String, Integer> words = new HashMap<>();
        for (String word : kwords) {
            words.put(word, Collections.frequency(list, word));
        }
        return words;
    }

    private void writeFile(HashMap<String, Integer> words) {
        try {
            outFile = new FileWriter(outputFile);
            for (Map.Entry<String, Integer> entry : words.entrySet()) {
                String s = entry.getKey() + " " + entry.getValue() + "\n";
                outFile.write(s.toCharArray());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outFile != null) {
                    outFile.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }
    }


}
