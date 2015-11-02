package javase04.t03.recoding;

import java.io.*;

/**
 * Created by Drazz on 02.11.2015.
 */
public class Recoding {

    public void recode() {
        BufferedReader in = null;
        try {
            File fileDir = new File("src/main/resources/file_utf8.txt");
            in = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream(fileDir), "UTF8"));
            StringBuilder sb = new StringBuilder();
            String str;
            while ((str = in.readLine()) != null) {
                sb.append(str + "\n");
            }
            write(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }
    }

    private void write(String text) {
        BufferedWriter out = null;
        try {
            File fileDir = new File("src/main/resources/file_utf16.txt");
            out = new BufferedWriter(
                    new OutputStreamWriter(
                        new FileOutputStream(fileDir), "UTF16"));
            out.write(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }
    }
}
