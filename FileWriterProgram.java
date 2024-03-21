import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterProgram {

        public static void main(String[] args) {
            
            File textFile = new File("main.txt");

            try {
                FileWriter writer = new FileWriter(textFile);
                writer.write("Talon De Couteau");
                writer.close();
                System.out.println("Printed successfully");
                
           
            } catch (Exception e) {
                System.err.println("Nag Error sya :(");
                e.printStackTrace();
            }

        }
}
