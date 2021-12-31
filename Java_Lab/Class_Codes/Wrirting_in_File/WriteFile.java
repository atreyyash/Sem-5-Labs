import java.io.*;

class WriteFile{
    public static void main(String[] args) {
        byte cities[] = {'D', 'E', 'L', 'H', 'I', '\n', 'M', 'A', 'D', 'R', 'A', 'S', '\n', 'L', 'O', 'N', 'D', 'O', 'N', '\n'};

        FileOutputStream outfile = null;
        try{
            outfile =new FileOutputStream("city.txt");
            outfile.write(cities);
            outfile.close();
        }
        catch(IOException ioe){
            System.out.println(ioe);
            System.exit(-1);
        }
    }
}