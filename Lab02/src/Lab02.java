import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Lab02 {

    public static void main(String[] args) {

        String dir = System.getProperty("user.dir");

        try {
            Scanner fin = new Scanner(Paths.get(dir, "example.txt"), "UTF-8");

            while (fin.hasNext()) {
                String word = fin.next();
                System.out.println("Word = " + word);
            }

        } catch (NoSuchFileException e) {
            System.out.println("Exception 1: " + e);
        } catch (IOException e) {
            System.out.println("Exception 2: " + e);
        } catch (Exception e) {
            System.out.println("Exception 3: " + e);
        }
    }
}