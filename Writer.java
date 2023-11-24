import java.io.BufferedWriter;
import java.io.FileWriter;
public class Writer {

    public static void main(String[] args) {

        String data = "Working at MSpace Solutions Limited";

    
        try {
        //create file writer
        FileWriter file = new FileWriter("/home/mspace/Java/FileWriter/output.txt");

        //create buffer writer
        BufferedWriter buffer = new BufferedWriter(file);

        //write the string to file
        buffer.write(data);

        //close the writer
        buffer.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            e.getStackTrace();
        }
    }
    
}
