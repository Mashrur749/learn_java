package fileIO;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File inputFile = new File("args[0]"); //source
        File outputFile = new File("args[1]"); //destination
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c = in.read()) != -1)
            out.write(c);
        in.close();
        out.close();
    }

}
