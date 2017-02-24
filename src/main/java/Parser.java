import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Nikita on 23-Feb-17.
 */
public class Parser {
    public void read(String fileName) throws IOException {

        Scanner scanner = new Scanner(new File(fileName));

        while(scanner.hasNext()){
            String[] tokens = scanner.nextLine().split(";");
            String last = tokens[tokens.length - 1];
            System.out.println(last);
        }
    }}
