package internal;

import java.io.*;

public class Parser {

    private static final String URL = "configs/cdr.txt";

    public static String reading() {
        String info;
        try (BufferedReader br = new BufferedReader(new FileReader(URL))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            info = sb.toString();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return info;
    }
}
