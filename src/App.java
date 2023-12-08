import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);

            int tal = 0;

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int n = 0;
                while (!Character.isDigit(data.charAt(n))) {
                    n++;
                }
                char z = data.charAt(n);

                n = 1;
                while (!Character.isDigit(data.charAt(data.length() - n))) {
                    n++;
                }
                char y = data.charAt(data.length() - n);

                tal += Integer.parseInt(z + "" + y);
            }
            myReader.close();

            System.out.println(tal);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
    }
    }
}