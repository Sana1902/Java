import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOperation {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("please enter the filename!!!!");
            return;
        }

        String filename = args[0];

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {

            boolean fileExists = true;
            try (BufferedReader fileReader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = fileReader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                fileExists = false;
            }

            if (!fileExists) {
                System.out.println("File does not exist. Creating a new file.");
            }

            while (true) {
                System.out.print("Do you want to add data at the end of the file? (Yes/No): ");
                String response = br.readLine();
                if (!response.equalsIgnoreCase("Yes")) {
                    break;
                }

                System.out.print("Enter data to append (type 'exit' on a new line to stop): ");
                String data;
                while ((data = br.readLine()) != null) {
                    if (data.equalsIgnoreCase("exit")) {
                        break;
                    }
                    bw.write(data);
                    bw.newLine();
                }
                bw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
