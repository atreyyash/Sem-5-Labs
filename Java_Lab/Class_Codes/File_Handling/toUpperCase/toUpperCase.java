// Creating a text File using FileWriter
import java.io.*;
import java.io.IOException;

class CreateFile {
    public static void main(String[] args) throws IOException {
        // Accept a string
        String str = "My first file handling program";

        // attach a file to FileWriter
        FileWriter fw = new FileWriter("output.txt");

        // read character wise from string and write
        // into FileWriter
        for (int i = 0; i < str.length(); i++){
            fw.write(Character.toUpperCase(str.charAt(i)));
        }

        System.out.println("Writing successful");
        // close the file
        fw.close();

        // variable declaration
        int ch;

        // check if File exists or not
        FileReader fr = null;
        try {
            fr = new FileReader("output.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }

        // read from FileReader till the end of file
        while ((ch = fr.read()) != -1)
            System.out.print((char) ch);

        // close the file
        fr.close();
    }
}