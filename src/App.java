import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        // String fileName = "/Users/srosehart/Repos/Practice/java-file-reading/text.txt";
        // also can do this
        String fileName = "text.txt";

        File textFile = new File(fileName);

        Scanner file = new Scanner(textFile);
        int value = file.nextInt();
        System.out.println("Read value: " + value);

        file.nextLine();

        int count = 2;
        while(file.hasNextLine()) {
            String line = file.nextLine();
            System.out.println(count + ": " +line);
            count++;
        }

        file.close();

    }
}
